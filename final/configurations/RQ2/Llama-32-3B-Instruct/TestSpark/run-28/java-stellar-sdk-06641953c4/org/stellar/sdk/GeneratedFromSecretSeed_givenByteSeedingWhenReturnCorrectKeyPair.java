package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedFromSecretSeed_givenByteSeedingWhenReturnCorrectKeyPair {

    @Test
    public void fromSecretSeed_givenByteSeedingWhenReturnCorrectKeyPair() throws NoSuchAlgorithmException, GeneralSecurityException {
        byte[] seed = "seed".getBytes();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getPublicKey());
    }

}