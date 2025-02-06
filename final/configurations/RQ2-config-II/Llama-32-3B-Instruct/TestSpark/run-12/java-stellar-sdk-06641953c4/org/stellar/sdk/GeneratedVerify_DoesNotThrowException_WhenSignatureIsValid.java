package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedVerify_DoesNotThrowException_WhenSignatureIsValid {

    @Test
    public void verify_DoesNotThrowException_WhenSignatureIsValid() {
        byte[] data = {1, 2, 3};
        byte[] signature = {4, 5, 6};
        assertTrue(KeyPair.fromBip39Seed("bip39-seed", 1).verify(data, signature));
    }

}