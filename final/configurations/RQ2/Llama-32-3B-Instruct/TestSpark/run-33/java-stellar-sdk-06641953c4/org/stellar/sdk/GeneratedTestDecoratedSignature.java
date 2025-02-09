package org.stellar.sdk;

public class GeneratedTestDecoratedSignature {

    private DecoratedSignature decoratedSignature;

    @Test
    public void testDecoratedSignature() throws Exception {
        // create a new instance of DecoratedSignature
        this.decoratedSignature = new DecoratedSignature();

        // verify the DecoratedSignature
        boolean isValid = this.decoratedSignature.verify(new byte[]{ /* byte array data */}, new byte[]{ /* byte array data */});
        System.out.println("Is valid: " + isValid);
    }

}