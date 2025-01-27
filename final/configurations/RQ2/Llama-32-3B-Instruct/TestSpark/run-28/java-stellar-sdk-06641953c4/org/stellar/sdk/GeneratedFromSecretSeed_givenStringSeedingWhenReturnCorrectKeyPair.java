package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedFromSecretSeed_givenStringSeedingWhenReturnCorrectKeyPair {

    @Test
    public void fromSecretSeed_givenStringSeedingWhenReturnCorrectKeyPair() throws NoSuchAlgorithmException, GeneralSecurityException {
        String seed = "seed".getBytes().toString();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getPublicKey());
    }

}