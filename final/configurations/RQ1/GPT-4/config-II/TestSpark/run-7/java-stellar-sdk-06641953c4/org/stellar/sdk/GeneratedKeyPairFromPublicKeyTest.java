package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedKeyPairFromPublicKeyTest {

    @Test
    public void keyPairFromPublicKeyTest() {
        // Test case for method "fromPublicKey".
        // Input is an array of bytes and expected output is a non-null keyPair
        byte[] publicKey = new byte[32];
        KeyPair result = KeyPair.fromPublicKey(publicKey);
        assertNotNull(result);
    }

}