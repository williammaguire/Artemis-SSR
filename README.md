# Artemis-SSR
Secure Software Report for Artemis Financial

# Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?
Artemis Financial is a consulting company that develops individualized financial plans for customers. They wanted to modernize their operations using the most current and effective software security, protecting client data and financial information in their public web interface.

# What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?
When analyzing their software for security vulnerabilities, the most apparent issue was use of public access modifiers in the /hash route of their web interface. These were changed to private access modifiers to encapsulate the checksum code, increasing security. It is important to address issues like this and keep code secure to circumvent the possibility of penertation attacks that take advantage of unexpected software behavior, no matter how unlikely, because it can be a risk to data and information integrity.

# What part of the vulnerability assessment was challenging or helpful to you?
The most challenging part of the vulnerability assessment was integrating and executing the Maven dependency check without issues. Debugging issues with this plugin taught me a lot about how plugins integrate into a java development environment and the eclipse IDE.

# How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
I increased layers of security through static and dynamic code checking, SSL certificate installation, vulnerability scanning, and checksum integration with the SHA-256 hashing algorithm. In the future, I would integrate most of these same tools because they've proven to be effective. However, I would switch from a self-signed SSL certificate to a public one from a vendor like OpenSSL because it works better with poublic-facing websites.

# How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
After updating the code, I re-ran several times with different input parameters to make sure I couldn't produce exploitable behavior. I also did some amateur penetration testing to see if I could get the application to behave in a way that would open up a vulnerability, but thankfully failed. I also re-ran the Maven dependency check, and no new vulnerabilities were found.

# What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
Learning about Maven and automated third-party vulnerability scanning was valuable. This course also gave me light exposure to the Spring framework, so if I need to use it in the future, I've already got a headstart.

# Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
This assignment demonstrates my ability to analyze a codebase for security vulnerabilities from several different perspectives. It also shows an understanding of cryptographic hash algorithms and the usage of signed certificates. These skills are valuable for a software developer to have, because security is important to stakeholders in any organization.
