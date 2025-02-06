package org.stellar.sdk;

public class GeneratedFromSecretSeedWithBip39ShouldCreateValidKeyPair {

    @Test
    public void fromSecretSeedWithBip39ShouldCreateValidKeyPair() throws Exception {
        byte[] bip39Seed = ...;
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}