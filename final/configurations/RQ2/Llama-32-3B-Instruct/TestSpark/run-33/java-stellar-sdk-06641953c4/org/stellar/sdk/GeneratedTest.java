package org.stellar.sdk;

public class GeneratedTest {

    private DecoratedSignature decoratedSignature;

    @Test
    public void testDecoratedSignature() throws Exception {
        // create a new instance of DecoratedSignature
        this.decoratedSignature = new DecoratedSignature();

        // verify the DecoratedSignature
        boolean isValid = this.decoratedSignature.verify(new byte[]{ /* byte array data */}, new byte[]{ /* byte array data */});
        System.out.println("Is valid: " + isValid);
    }

    @Test
    public void testSignDecorated() throws Exception {
        // implementation to sign with DecoratedSignature
        byte[] signature = new byte[]{ /* byte array data */};

        // verify the signing result of DecoratedSignature
        boolean isValid = this.decoratedSignature.signDecorated(new byte[]{ /* byte array data */}, signature);
        System.out.println("Is valid: " + isValid);
    }

}