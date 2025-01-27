package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

public class Generated[FromSecretSeed][ValidSeed]

Test {

    @Test
    public void [FromSecretSeed][ValidSeed]Test() throws Exception {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed".toCharArray());
        assertNotNull(keyPair.getPublicKey());
        assertNotNull(keyPair.getAccountId());
    }

}