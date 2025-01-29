package org.stellar.sdk;

public class GeneratedTestRandomKeyPair {

    @Test
    public void testRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertEquals(KeyPair.class, keyPair.getClass());
        assertNotEquals(null, keyPair.getSecretSeed());
    }

}