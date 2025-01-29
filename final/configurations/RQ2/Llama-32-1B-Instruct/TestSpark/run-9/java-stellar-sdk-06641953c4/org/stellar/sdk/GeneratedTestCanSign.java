package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair key = new KeyPair(new EdDSAPublicKey("xpub-key"));
        Preconditions.assertTrue(key.canSign());
    }

}