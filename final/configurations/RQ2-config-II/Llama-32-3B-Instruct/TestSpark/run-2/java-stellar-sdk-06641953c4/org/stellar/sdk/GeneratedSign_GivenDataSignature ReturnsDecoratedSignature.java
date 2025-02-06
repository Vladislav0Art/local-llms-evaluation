package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedSign_GivenDataSignature ReturnsDecoratedSignature {

    @Test
    public void sign_GivenDataSignature

    ReturnsDecoratedSignature() throws IOException, GeneralSecurityException {
        byte[] data = "data".getBytes();
        byte[] signature = {4, 5, 6};
        DecoratedSignature decoratedSignature = new KeyPair(new EdDSAPublicKey(data)).sign(data);
        assertNotNull(decoratedSignature);
    }

}