package org.stellar.sdk;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}