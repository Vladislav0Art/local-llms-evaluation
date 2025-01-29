package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey("publicKey");
        assertTrue(KeyPair.canSign(publicKey));
    }

}