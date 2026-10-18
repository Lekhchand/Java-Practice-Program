import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Encoder;



import java.security.Key;
import sun.misc.BASE64Decoder;


public class AesEncrDec {

		   private static final String ALGORITHM       = "AES";
		   private static final String myEncryptionKey = "ThisIsSecurityKi";
		   private static final String UNICODE_FORMAT  = "UTF8";

	public static void main(String[] args) throws Exception {

		String value = "ifms123";
		String valueEnc = AesEncrDec.encrypt(value);
		String valueDec = AesEncrDec.decrypt(valueEnc);

		System.out.println("Plain Text : " + value);
		System.out.println("Encrypted : " + valueEnc);
		System.out.println("Decrypted : " + valueDec);
	}
		   
		   
	public static String encrypt(String valueToEnc) throws Exception {
		
		 //Key key = generateKey();
		 byte[] keyAsBytes;
			keyAsBytes = myEncryptionKey.getBytes("UTF8");
			Key key = new SecretKeySpec(keyAsBytes, "AES");
		 Cipher c = Cipher.getInstance("AES");
		 c.init(Cipher.ENCRYPT_MODE, key);  //////////LINE 20
		 byte[] encValue = c.doFinal(valueToEnc.getBytes());
		 String encryptedValue = new BASE64Encoder().encode(encValue);
		 return encryptedValue;
	}

	public static String decrypt(String encryptedValue) throws Exception {
		
		//Key key = generateKey();
		 byte[] keyAsBytes;
			keyAsBytes = myEncryptionKey.getBytes("UTF8");
			Key key = new SecretKeySpec(keyAsBytes, "AES");
		Cipher c = Cipher.getInstance("AES");
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedValue);
		byte[] decValue = c.doFinal(decordedValue);
		String decryptedValue = new String(decValue);
		return decryptedValue;
	}

	private static Key generateKey() throws Exception {
		
		byte[] keyAsBytes;
		keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
		Key key = new SecretKeySpec(keyAsBytes, ALGORITHM);
		return key;
	}

		

	
	//2nd method
	/*public static void main(String[] args) throws Exception {
		  
		  byte[] input = "www.javacodegeeks.com".getBytes();
		
		  byte[] keyBytes = new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
		
		  SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
		
		  Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		
		  System.out.println(new String(input));
		
		  // encryption pass
		
		  cipher.init(Cipher.ENCRYPT_MODE, key);
		
		  byte[] cipherText = new byte[cipher.getOutputSize(input.length)];
		
		  int ctLength = cipher.update(input, 0, input.length, cipherText, 0);
		
		  ctLength += cipher.doFinal(cipherText, ctLength);
		
		  System.out.println("Encrypted output : "+new String(cipherText).getBytes("UTF-8").toString());
		
		  System.out.println("Encrypted output length : "+ctLength);
		
		  // decryption pass
		
		  cipher.init(Cipher.DECRYPT_MODE, key);
		
		  byte[] plainText = new byte[cipher.getOutputSize(ctLength)];
		
		  int ptLength = cipher.update(cipherText, 0, ctLength, plainText, 0);
		
		  ptLength += cipher.doFinal(plainText, ptLength);
		
		  System.out.println(new String(plainText));
		
		  System.out.println("Decrypted output length: "+ptLength);
		
		    }*/


////1st method
	/*public static void main(String args[]){
		
    new AesEncrDec().encrypt();
}
void encrypt()
{
    try
    {
    String plainData="ifms123",cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    Cipher aesCipher = Cipher.getInstance("AES");
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    byte[] byteDataToEncrypt = plainData.getBytes();
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    cipherText = new BASE64Encoder().encode(byteCipherText);
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    decryptedText = new String(byteDecryptedText);
    System.out.println("\n Plain Data : "+plainData+" \n Cipher Data : "+cipherText+" \n Decrypted Data : "+decryptedText);
    }
    catch(Exception e)
    {
         
    }
}*/
}
