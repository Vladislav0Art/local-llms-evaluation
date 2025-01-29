package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("1234567890abcdef"));
        assertTrue(key.canSign());
    }

}