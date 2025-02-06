package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedVerify_ThrowsException_WhenSignatureIsInvalid {

    @Test
    public void verify_ThrowsException_WhenSignatureIsInvalid() {
        byte[] data = {1, 2, 3};
        byte[] signature = {4, 5, 6, 7};
        assertFalse(KeyPair.fromBip39Seed("bip39-seed", 1).verify(data, signature));
    }

}