package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testGenerateKeyPair() throws GeneralSecurityException {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.getPublicKey().length == 32);
    }

}