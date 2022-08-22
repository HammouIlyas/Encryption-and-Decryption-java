public class Main {
    public static void main(String[] args) throws Exception {
        AES_ENCRYPTION aes_encryption = AES_ENCRYPTION.getInstanceAesEncryption();
        String encryptedMessage =aes_encryption.encrypt("this message will be crypted and decrypted");
        System.out.println("encryptedValue = " + encryptedMessage);
        System.out.println(aes_encryption.decrypt(encryptedMessage));

    }
}
