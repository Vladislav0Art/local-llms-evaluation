package org.stellar.sdk;

public class GeneratedWhenCannotSignThenThrowException {

    @Test
    public void whenCannotSignThenThrowException() {
        KeyPair keyPair = new KeyPair(KeyPair.random().getPublicKey());
        try {
            assertNotEquals(0, keyPair.sign(null));
            fail("Expected SignatureException");
        } catch (SignatureException e) {
            // expected
        }
    }

}