package org.stellar.sdk;

import static org.stellar.sdk.KeyPair.fromAccountId;
import static org.stellar.sdk.KeyPair.fromBip39Seed;
import static org.stellar.sdk.KeyPair.fromPublicKey;
import static org.stellar.sdk.KeyPair.fromSecretSeed;
import static org.stellar.sdk.KeyPair.random;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.SignatureHint;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair kp = random();
        assertTrue(kp.canSign());
    }

}