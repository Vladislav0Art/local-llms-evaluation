package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromSecretSeed_WithCorrectSeed_ReturnsKeyPair {

    @Test
    public void fromSecretSeed_WithCorrectSeed_ReturnsKeyPair() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret seed".toCharArray());
        assertNotNull(keyPair);
        assertTrue(keyPair.getSecretSeed().length == 32);
    }

}