package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{4, 5, 6});
        boolean canSign = keyPair.canSign();
        assertTrue(canSign);
    }

}