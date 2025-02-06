package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerify_CanVerifyData {

    @Test
    public void verify_CanVerifyData() throws GeneralSecurityException, IOException {
        byte[] data = "data".getBytes();
        byte[] signature = new byte[64];
        Signature.sign(data, signature);
        KeyPair keyPair = KeyPair.fromSecretSeed(signature);
        assertTrue(keyPair.verify(data, signature));
    }

}