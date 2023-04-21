package com.snhu.sslserver;

import java.security.MessageDigest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIfXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ServerController{
		/***************************************************************************************
		* 	 Byte-Hexadecimal conversion algorithm provided by anonymous contributor on Baeldung.com
		*    Title: Converting Between Byte Arrays and Hexadecimal Strings in Java
		*    Author: Baeldung
		*    Date: May 23, 2022
		*    Availability: https://www.baeldung.com/java-byte-arrays-hex-strings
		*
		***************************************************************************************/
		private String byteToHex(byte num) {
		    char[] hexDigits = new char[2];
		    hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
		    hexDigits[1] = Character.forDigit((num & 0xF), 16);
		    return new String(hexDigits);
		}
		
		private String bytesToHex(byte[] byteArray) {
		    StringBuffer hexStringBuffer = new StringBuffer();
		    for (int i = 0; i < byteArray.length; i++) {
		        hexStringBuffer.append(byteToHex(byteArray[i]));
		    }
		    return hexStringBuffer.toString();
		}
		
	    @RequestMapping("/hash")
	    private String myHash(){
	    	String data = "William Maguire Mod 7 Project Checksum";
	    	String hash = "";
	    	
	    	try {
				MessageDigest md = MessageDigest.getInstance("SHA-256");
				byte[] hashvalue = md.digest(data.getBytes());
				hash = bytesToHex(hashvalue);
			} catch (Exception e) {
				e.printStackTrace();
				return "Error generating checksum";
			}
	    	
	        return "<p>data:" + data + "<br>"
	        + "Name of Cipher Algorithm Used:SHA-256<br>"
	        + "CheckSum Value: " + hash;
	    }
	}