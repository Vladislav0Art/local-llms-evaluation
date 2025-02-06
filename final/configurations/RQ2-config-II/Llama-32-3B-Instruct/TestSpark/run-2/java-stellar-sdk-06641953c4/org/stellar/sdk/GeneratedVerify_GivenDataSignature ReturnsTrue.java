package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedVerify_GivenDataSignature ReturnsTrue {

    @Test
    public void verify_GivenDataSignature

    ReturnsTrue() throws IOException, GeneralSecurityException {
        byte[] data = "data".getBytes();
        byte[] signature = {4, 5, 6};
        assertTrue(new KeyPair(new EdDSAPublicKey(data)).verify(data, signature));
    }

}