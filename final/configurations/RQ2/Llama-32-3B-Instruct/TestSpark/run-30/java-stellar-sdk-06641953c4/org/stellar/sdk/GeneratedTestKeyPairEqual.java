package org.stellar.sdk;

public class GeneratedTestKeyPairEqual {

    @Test
    public void testKeyPairEqual() {
        KeyPair keyPair1 = new KeyPair();
        KeyPair keyPair2 = new KeyPair();
        assertTrue(keyPair1.equals(keyPair2));
    }

}