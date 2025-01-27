package org.stellar.sdk;

public class GeneratedCreateKeyPairFromBip39Seedbip39SeedArrayTest {

    @Test
    public void createKeyPairFromBip39Seedbip39SeedArrayTest() {
        byte[] bip39Seed = "0123456789".getBytes();
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}