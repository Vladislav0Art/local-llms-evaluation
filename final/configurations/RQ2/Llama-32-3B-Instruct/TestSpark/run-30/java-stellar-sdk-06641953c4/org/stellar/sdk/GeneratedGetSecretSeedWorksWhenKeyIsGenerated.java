package org.stellar.sdk;

public class GeneratedGetSecretSeedWorksWhenKeyIsGenerated {

    @Test
    public void getSecretSeedWorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSecretSeed());
    }

}