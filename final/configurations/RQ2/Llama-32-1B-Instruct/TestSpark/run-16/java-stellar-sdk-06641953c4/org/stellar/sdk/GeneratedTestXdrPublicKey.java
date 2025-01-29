package org.stellar.sdk;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.fromXdr(new byte[]{1, 2, 3});
        System.out.println(publicKey.getEncoded());
    }

}