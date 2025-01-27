package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedGenerateKeyPair_GivenPublicKey_ReturnsSameKeyPair {

    @Test
    public void generateKeyPair_GivenPublicKey_ReturnsSameKeyPair() throws NoSuchAlgorithmException {
        EdDSAPublicKey publicKey = KeyPairGenerator.generate();
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}