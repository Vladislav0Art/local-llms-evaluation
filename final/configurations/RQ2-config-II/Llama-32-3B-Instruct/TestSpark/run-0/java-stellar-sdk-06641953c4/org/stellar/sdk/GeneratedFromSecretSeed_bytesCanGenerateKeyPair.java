package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedFromSecretSeed_bytesCanGenerateKeyPair {

    @Test
    public void fromSecretSeed_bytesCanGenerateKeyPair() {
        byte[] seed = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getAccountId());
    }

}