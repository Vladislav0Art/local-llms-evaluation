package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSignDecorated_CanSignData {

    @Test
    public void signDecorated_CanSignData() throws GeneralSecurityException, IOException {
        byte[] data = "data".getBytes();
        byte[] signature = new byte[64];
        Signature.sign(data, signature);
        KeyPair keyPair = KeyPair.fromSecretSeed(signature);
        DecoratedSignature decoratedSignature = new DecoratedSignature(keyPair.getSignatureHint(), Arrays.copyOf(signature, 64));
        assertTrue(decoratedSignature.verify(data, signature));
    }

}