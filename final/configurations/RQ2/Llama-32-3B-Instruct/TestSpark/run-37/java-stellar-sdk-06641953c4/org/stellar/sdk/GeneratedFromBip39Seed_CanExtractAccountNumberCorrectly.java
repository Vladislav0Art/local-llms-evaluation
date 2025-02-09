package org.stellar.sdk;

public class GeneratedFromBip39Seed_CanExtractAccountNumberCorrectly {

    public static int fromBip39Seed(byte[] seed, int accountNumber) {
        // Implement logic to extract account number
        return accountNumber;
    }

    public static String fromXdrSignerKey(SignerKey signerKey) {
        // Implement logic to convert XDR format to SignerKey format
        return null;
    }
}

public class KeyPairTest {

    @Test
    public void fromBip39Seed_CanExtractAccountNumberCorrectly() {
        // Arrange
        byte[] seed = "my_seed".getBytes();
        int accountNumber = 0; // Replace with actual value

        // Act and Assert
        int result = KeyPairUtil.fromBip39Seed(seed, accountNumber);
        assertEquals(accountNumber, result);
    }

}