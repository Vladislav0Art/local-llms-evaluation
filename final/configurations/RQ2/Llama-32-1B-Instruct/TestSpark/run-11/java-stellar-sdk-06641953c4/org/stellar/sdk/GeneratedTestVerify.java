package org.stellar.sdk;

public class GeneratedTestVerify {

    @Test
    public void testVerify() {
        String data = "hello-world";
        Signature signature = new Signature();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new byte[]{1, 2, 3}));
        boolean verify = keyPair.verify(data, signature);
        assertEquals(verify, true);
    }

}