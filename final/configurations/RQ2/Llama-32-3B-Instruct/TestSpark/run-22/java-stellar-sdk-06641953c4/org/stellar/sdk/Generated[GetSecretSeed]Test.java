package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

public class Generated[GetSecretSeed]

Test {

    @Test
    public void [GetSecretSeed]Test() throws Exception {
        KeyPair keyPair = KeyPair.random();
        char[] seed = ((EdDSAPrivateKey) keyPair.getPrivateKey()).getSeed();
        assertNotNull(seed);
    }

}