package com.pe.l1.javasecurity.crypto;

import com.pe.l1.utility.ExitModule;

public class Crypto {

	public static void intro(){
		
        System.out.println("----Cryptography----\n");
       
        System.out.println("Cryptography : Cryptography is technique of securing information and communications through use of codes so that only those person for whom the information is intended can understand it and process it. Thus preventing unauthorized access to information.\n"
        		+"The prefix �crypt� means �hidden� and suffix graphy means �writing�. Thus it is an art of writing secret data.\r\n" + 
        		"In Cryptography the techniques which are use to protect information are obtained from mathematical concepts and a set of rule based calculations known as algorithms to convert messages in ways that make it hard to decode it.\n "
        		+"These algorithms are used for cryptographic key generation, digital signing, verification to protect data privacy, web browsing on internet and to protect confidential transactions such as credit card and debit card transactions.\r\n");
        
        System.out.println("-----Features (or) Principles in Cryptography----- \n");
        
        System.out.println("There are 5 main principles of security which ensures the data is secured.They are : \n");
       
        System.out.println("1.Data confedentiality : It is mainly concerned with preventing the unauthorized disclosure of sensitive and private information.\n"
        		+ "In other words,it is to maintain the privacy such that no one else can read the data except authorized party.\n");

        System.out.println("2.Data Integrity : It ensures that there shouldn't be any alteration/modification in storage or transition of data.\n"
        		+"The data received by receiver should be exactly same as the data sent by authorized sender.\n");
        
        System.out.println("3.Authentication : It is very important in security inorder to verify the identity of sender and receiver.\n"
        		+"The ability to prove that a message was generated by a particular party, and prevent forgery of new messages.\n"
        		+"This is usually provided via a Message Authentication Code (MAC). Note that authenticity automatically implies integrity.\n");
        		
        System.out.println("4.Data Availability : It ensures that only authorized user has the access to the system and network.\n"
        		+ "Data must be available to authorized parties so that whenever they need they can access the information.\n");
        
        System.out.println("5.Non-Repudiation : Non-repudiation is a legal concept that is widely used in information security and refers to a service, which provides proof of the origin of data and the integrity of the data.\n"
        		+"It is the assurance that someone cannot deny the validity of something.Sender / receiver cannot deny of transmitted data.\n");
        
        System.out.println("\n----Types of Cryptography----\n");
       
        System.out.println("In general,there are 3 types of Cryptography:\n ");
       
        System.out.println("1. Symmetric key Cryptography (or) Secret key Cryptography (or) Private key Cryptography : It is an encryption scheme where the sender and receiver of message use a single common key to encrypt and decrypt messages.\n "
        		+ "Symmetric Key Systems are faster and simpler but the problem is that sender and receiver have to somehow exchange key is a secure manner.\n "
        		+ " The strength of symmetric key cryptography depends upon the number of key bits.This is primarily used for privacy and confidentiality. \n"
        		+ "\nExamples for symmetric key cryptography : AES, DES, 3DES,Blowfish, Twofish, RC1, RC2, RC3, RC4, RC5, RC6, IDEA \n"
        		+"\n -----Working of Symmetric key encryption-----\n"
        		+ "\n Symmetric encryption schemes rely on a single key that is shared between two or more users.\n "
        		+ "The same key is used to encrypt and decrypt the so-called plaintext (which represents the message or piece of data that is being encoded).\n"
        		+ "The process of encryption converting a plaintext (input) through an encryption algorithm called a cipher, which in turn generates a ciphertext (output)\n"
        		+ "and process of decryption is converting cipher text back to plain text (original text). \n"
        		+ "\n In Encryption process : plain text(message) + secret key -> cipher text(encrypted message) \n"
        		+ "\n In Decryption process : cipher text + secret key -> plain text(original message)\n ");
      
        System.out.println("\n 2. Asymmetric key Cryptography (or) Public key Cryptography :It is an encryption scheme under which a pair of keys(public and private keys) is used to encrypt and decrypt information.\n"
        		+ "one key is used for encryption and other is used for decryption.If the public key is used for encryption, the related private key is used for decryption and if the private key is used for encryption, the related public key is used for decryption."
        		+ "Even if the public key is known by everyone the intended receiver can only decode it because he alone knows the private key.\n"
        		+ "Asymmetric encryption is also used for creating digital signatures.The public key enables people to encrypt messages and verify signatures and the private key allows for decrypting messages and the generation of signatures.\n"
        		+ "\nExamples for asymmetric cruptography: RSA, Diffe-Hellman, Elgamal, ECC, DSA \n"
        		+ "Protocols that rely on asymmetric cryptography for encryption are : Many protocols like SSH, OpenPGP, S/MIME, and SSL/TLS .\n"
        		+ "\n-----Working of Asymmetric key encryption-----\n "
        		+ "The process of encryption is encrypting plain text with public key of receiver with asymmetric algorithm which creates cipher text.\n"
        		+ "The process of decryption is converting back cipher text with receiver's private key into plain text.\n "
        		+ "\n In Encryption process : plain text(message) + public key -> cipher text(encrypted message) \n" 
        		+ "\n In Decryption process : cipher text + private key -> plain text(original message)\n ");
        
        System.out.println("\n 3. Hash Functions : In cryptography, a hash function is a mathematical algorithm that maps data of any size to a bit string of a\n"
        		+" fixed size value called hash value or message digest or hash code.It is one-way encryption.Once hashing is done it cannot be unhashed.\n"
        		+ "These hash algorithms are mostly used by operating systems to encrypt password.Unlike symmetric,asymmetric this hash doesn't use any key.\n"
        		+ "Examples of hash algorithms: Message digest(MD->MD1,MD2,MD3,MD4,MD5),Secure Hash algorithms(SHA->SHA-0,SHA-1,SHA-2,SHA-256,SHA-384,SHA-512),PBKDF2, BCrypt, SCrypt \n "
        		+ " \n");
        
        
        ExitModule.pressEnterToExit();
    }
}
