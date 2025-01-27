package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedGetSecretSeed {

    @Test
    public void getSecretSeed() {
        char[] secretSeed = "secretseed".toCharArray();
        KeyPair keyPair = new KeyPair(null); // constructor not used here, just a placeholder
        assertNotNull(keyPair.getSecretSeed());
    }

}