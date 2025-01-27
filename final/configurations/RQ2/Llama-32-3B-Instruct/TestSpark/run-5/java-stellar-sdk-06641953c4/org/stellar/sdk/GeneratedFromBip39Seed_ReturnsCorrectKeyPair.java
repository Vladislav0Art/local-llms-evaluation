package org.stellar.sdk;

public class GeneratedFromBip39Seed_ReturnsCorrectKeyPair {

    @Test
    public void fromBip39Seed_ReturnsCorrectKeyPair() throws GeneralSecurityException {
        KeyPair expectedKey = new KeyPair(new EdDSAPublicKey());
        KeyPair actualKey = KeyPair.fromBip39Seed("bip39seed1234567890".getBytes(), 1);
        assertEquals(expectedKey, actualKey);
    }

}