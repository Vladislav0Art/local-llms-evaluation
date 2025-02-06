package org.stellar.sdk;

public class GeneratedRandom_IsGenerated_true {

    @Test
    public void random_IsGenerated_true() throws Exception {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

}