package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedKeyPairFromSecretSeedTest {

    @Test
    public void keyPairFromSecretSeedTest() {
        // Test case for method "fromSecretSeed" where input is an array of characters
        // Expected result is a non-null KeyPair
        char[] seed = new char[50];
        KeyPair result = KeyPair.fromSecretSeed(seed);
        assertNotNull(result);
    }

}