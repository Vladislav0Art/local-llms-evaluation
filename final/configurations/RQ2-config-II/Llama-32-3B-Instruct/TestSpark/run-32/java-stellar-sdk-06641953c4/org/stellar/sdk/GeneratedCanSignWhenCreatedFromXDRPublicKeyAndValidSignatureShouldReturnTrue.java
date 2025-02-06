package org.stellar.sdk;

public class GeneratedCanSignWhenCreatedFromXDRPublicKeyAndValidSignatureShouldReturnTrue {

    @Test
    public void canSignWhenCreatedFromXDRPublicKeyAndValidSignatureShouldReturnTrue() throws Exception {
        PublicKey xdrPublicKey = ...;
        byte[] signature = ...;
        boolean result = keyPair.verify(xdrPublicKey, signature);
        assertTrue(result);
    }

}