package org.stellar.sdk;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        KeyPair randomKeyPair = KeyPair.random();
        assertTrue(randomKeyPair.getPublicKey().equals(new EdDSAPublicKey("publicKey")));
        assertTrue(randomKeyPair.getSecretSeed().equals(new char[]{'s', 'e', 'c', 'r', 'e', 't'}));
    }

}