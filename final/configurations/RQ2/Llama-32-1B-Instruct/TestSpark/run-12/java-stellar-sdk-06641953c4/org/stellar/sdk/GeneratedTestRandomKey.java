package org.stellar.sdk;

public class GeneratedTestRandomKey {

    @Test
    public void testRandomKey() {
        KeyPair key = KeyPair.random();
        assertEquals("1234567890abcdef", key.getSecretSeed());
    }

}