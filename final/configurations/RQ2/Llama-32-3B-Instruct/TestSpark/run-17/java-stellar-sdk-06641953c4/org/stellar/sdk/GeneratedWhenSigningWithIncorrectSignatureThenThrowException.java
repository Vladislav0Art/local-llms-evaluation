package org.stellar.sdk;

public class GeneratedWhenSigningWithIncorrectSignatureThenThrowException {

    @Test
    public void whenSigningWithIncorrectSignatureThenThrowException() {
        KeyPair keyPair = new KeyPair(KeyPair.random().getPublicKey());
        try {
            keyPair.sign();
            fail("Expected SignatureException");
        } catch (SignatureException e) {
            // expected
        }
    }

}