package org.stellar.sdk;

public class GeneratedFromAccountId_ReturnsCorrectKeyPair {

    @Test
    public void fromAccountId_ReturnsCorrectKeyPair() throws GeneralSecurityException {
        KeyPair expectedKey = new KeyPair(new EdDSAPublicKey());
        KeyPair actualKey = KeyPair.fromAccountId("account1234567890");
        assertEquals(expectedKey, actualKey);
    }

}