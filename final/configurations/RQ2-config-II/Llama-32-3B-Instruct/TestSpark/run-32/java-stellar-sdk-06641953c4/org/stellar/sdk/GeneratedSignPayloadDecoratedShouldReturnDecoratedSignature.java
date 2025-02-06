package org.stellar.sdk;

public class GeneratedSignPayloadDecoratedShouldReturnDecoratedSignature {

    @Test
    public void signPayloadDecoratedShouldReturnDecoratedSignature() {
        byte[] data = ...;
        byte[] signerPayload = ...;
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(signerPayload);
        assertNotNull(decoratedSignature);
        assertFalse(decoratedSignature.isEmpty());
    }

}