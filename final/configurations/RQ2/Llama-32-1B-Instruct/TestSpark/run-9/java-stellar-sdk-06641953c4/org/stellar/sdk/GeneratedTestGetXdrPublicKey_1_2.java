package org.stellar.sdk;

public class GeneratedTestGetXdrPublicKey_1_2 {

    @Test
    public void testGetXdrPublicKey_1_2() {
        KeyPair key = new KeyPair(new EdDSAPublicKey("xpub-key"));
        PublicKey publicKey = key.getXdrPublicKey();
        Preconditions.assertSame("public-key", publicKey);
    }

}