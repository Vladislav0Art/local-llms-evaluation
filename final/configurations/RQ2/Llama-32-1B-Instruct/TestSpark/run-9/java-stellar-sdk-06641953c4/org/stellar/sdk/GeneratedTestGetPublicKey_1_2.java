package org.stellar.sdk;

public class GeneratedTestGetPublicKey_1_2 {

    @Test
    public void testGetPublicKey_1_2() {
        KeyPair key = new KeyPair(new EdDSAPublicKey("xpub-key"));
        byte[] publicKey = key.getPublicKey();
        Preconditions.assertArrayEquals("public-key", publicKey);
    }

}