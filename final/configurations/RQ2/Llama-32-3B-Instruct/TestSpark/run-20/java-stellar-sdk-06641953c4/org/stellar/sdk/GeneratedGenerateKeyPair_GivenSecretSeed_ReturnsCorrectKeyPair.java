package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedGenerateKeyPair_GivenSecretSeed_ReturnsCorrectKeyPair {

    @Test
    public void generateKeyPair_GivenSecretSeed_ReturnsCorrectKeyPair() throws NoSuchAlgorithmException, GeneralSecurityException {
        char[] seed = "my_secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(2, keyPair.getPublicKey().getEncodedLength());
        assertEquals(32, keyPair.getSignerKey().getEncodedLength());
    }

}