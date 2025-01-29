package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey_1_2 {

    @Test
    public void testFromXdrPublicKey_1_2() {
        PublicKey publicKey = new PublicKey("public-key");
        KeyPair key = KeyPair.fromXdrPublicKey(publicKey);
        Preconditions.assertTrue(key.canSign());
    }

}