package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerify_ReturnsTrueForCorrectSignature {

    @Test
    public void verify_ReturnsTrueForCorrectSignature() {
        byte[] data = new byte[]{14, 15, 16};
        byte[] signature = new byte[]{17, 18, 19};
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.verify(data, signature));
    }

}