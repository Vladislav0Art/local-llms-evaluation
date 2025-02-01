package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedSignDataTest {

    @Test
    public void signDataTest() {
        // Test method "sign(byte[] data)".
        // Input is an array of bytes. Expected: RuntimeException because privateKey is null.
        byte[] data = new byte[32];
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        keyPair.sign(data);
    }

}