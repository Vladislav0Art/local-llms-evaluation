package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedKeyPairInsecureFromSecretSeedTest {

    @Test
    public void keyPairInsecureFromSecretSeedTest() {
        // Test case for "fromSecretSeed" where input is a string.
        // As this method is insecure, RuntimeException is expected
        String seed = "secretSeed";
        KeyPair.fromSecretSeed(seed);
    }

}