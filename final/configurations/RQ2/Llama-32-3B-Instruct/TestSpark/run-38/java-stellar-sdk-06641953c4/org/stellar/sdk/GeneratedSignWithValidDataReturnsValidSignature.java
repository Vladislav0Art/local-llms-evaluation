package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSignWithValidDataReturnsValidSignature {

    @Test
    public void signWithValidDataReturnsValidSignature() {
        byte[] data = createByteArray("data");
        Signature signature = new Signature(data, "signature");
        byte[] expectedSignature = Arrays.copyOfRange(signature.signatureBytes(), 0, 16);
        KeyPair keyPair = KeyPair.fromSecretSeed(createCharArray("1234567890"));
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        assertEquals(expectedSignature, decoratedSignature.signature);
    }

}