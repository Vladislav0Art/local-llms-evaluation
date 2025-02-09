package org.stellar.sdk;

public class GeneratedTestSignDecorated {

    private DecoratedSignature decoratedSignature;

    @Test
    public void testSignDecorated() throws Exception {
        // implementation to sign with DecoratedSignature
        byte[] signature = new byte[]{ /* byte array data */};

        // verify the signing result of DecoratedSignature
        boolean isValid = this.decoratedSignature.signDecorated(new byte[]{ /* byte array data */}, signature);
        System.out.println("Is valid: " + isValid);
    }

}