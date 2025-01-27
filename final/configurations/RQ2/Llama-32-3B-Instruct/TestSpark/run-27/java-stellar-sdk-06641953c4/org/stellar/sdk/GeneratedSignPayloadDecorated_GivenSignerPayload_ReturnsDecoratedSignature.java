package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSignPayloadDecorated_GivenSignerPayload_ReturnsDecoratedSignature {

    @Test
    public void signPayloadDecorated_GivenSignerPayload_ReturnsDecoratedSignature() {
        byte[] signerPayload = "my_signer_payload".getBytes();
        DecoratedSignature decoratedSignature = new DecoratedSignature();
        KeyPair keyPair = new KeyPair(decoratedSignature);
        assertArrayEquals(signerPayload, keyPair.signPayloadDecorated(signerPayload));
    }

}