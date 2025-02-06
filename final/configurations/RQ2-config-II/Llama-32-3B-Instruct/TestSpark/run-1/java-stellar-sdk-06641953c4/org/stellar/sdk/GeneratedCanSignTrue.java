package org.stellar.sdk;

public class GeneratedCanSignTrue {

    @Test
    public void canSignTrue() throws GeneralSecurityException {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        KeyPair keyPair = new KeyPair(privateKey);
        assertTrue(keyPair.canSign());
    }

}