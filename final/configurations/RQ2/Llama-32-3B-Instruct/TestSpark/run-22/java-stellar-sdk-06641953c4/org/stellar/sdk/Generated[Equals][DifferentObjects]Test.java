package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

public class Generated[Equals][DifferentObjects]

Test {

    @Test
    public void [Equals][DifferentObjects]Test() {
        assertNotEquals(KeyPair.fromSecretSeed("secretSeed".toCharArray()), new KeyPair(new EdDSAPublicKey()));
    }

}