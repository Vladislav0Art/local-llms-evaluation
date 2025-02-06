package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedRandom_canGenerateKeyPair {

    @Test
    public void random_canGenerateKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

}