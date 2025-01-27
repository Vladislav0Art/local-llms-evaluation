package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

public class Generated[FromSecretSeed][EmptySeed]

Test {

    @Test
    public void [FromSecretSeed][EmptySeed]Test() {
        assertThrows(GeneralSecurityException.class, KeyPair::fromSecretSeed, "null");
        assertThrows(GeneralSecurityException.class, KeyPair::fromSecretSeed, "");
        assertThrows(GeneralSecurityException.class, KeyPair::fromSecretSeed, new char[0]);
    }

}