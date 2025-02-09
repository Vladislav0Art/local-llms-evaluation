package org.stellar.sdk;

public class GeneratedTestEdDSAPublicKey {

    @Test
    public void testEdDSAPublicKey() throws GeneralSecurityException {
        // create a new instance of EdDSAPublicKey
        byte[] bytes = { /* byte array data */};
        EdDSAPublicKey publicKey = new EdDSAPublicKey(bytes);

        // verify the EdDSAPublicKey
        boolean isValid = publicKey.verify(new byte[]{ /* byte array data */}, new byte[]{ /* byte array data */});
        System.out.println("Is valid: " + isValid);
    }

}