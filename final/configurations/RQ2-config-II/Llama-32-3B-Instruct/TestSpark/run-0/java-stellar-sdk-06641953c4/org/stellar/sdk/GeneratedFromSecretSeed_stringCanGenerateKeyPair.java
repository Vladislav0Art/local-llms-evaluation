package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedFromSecretSeed_stringCanGenerateKeyPair {

    @Test
    public void fromSecretSeed_stringCanGenerateKeyPair() {
        String seed = "1234567890";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getAccountId());
    }

}