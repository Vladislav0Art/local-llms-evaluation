package org.stellar.sdk;

public class GeneratedGetPublicKeyWorksWhenKeyIsGenerated {

    @Test
    public void getPublicKeyWorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

}