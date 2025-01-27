package org.stellar.sdk;

public class GeneratedFromPublicKey_ReturnsCorrectKeyPair {

    @Test
    public void fromPublicKey_ReturnsCorrectKeyPair() throws GeneralSecurityException {
        KeyPair expectedKey = new KeyPair(new EdDSAPublicKey());
        KeyPair actualKey = KeyPair.fromPublicKey("1234567890".getBytes());
        assertEquals(expectedKey, actualKey);
    }

}