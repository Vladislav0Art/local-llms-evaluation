package org.stellar.sdk;

public class GeneratedTestRandomKeyPair_3_4 {

    @Test
    public void testRandomKeyPair_3_4() {
        KeyPair key = KeyPair.random();
        Preconditions.assertTrue(key.canSign());
    }

}