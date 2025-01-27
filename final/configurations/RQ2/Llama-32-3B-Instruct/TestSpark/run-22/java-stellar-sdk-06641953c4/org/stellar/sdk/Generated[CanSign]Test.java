package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

public class Generated[CanSign]

Test {

    @Test
    public void [CanSign]Test() throws Exception {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed".toCharArray());
        assertTrue(keyPair.canSign());
        assertFalse(KeyPair.fromAccountId("accountId").canSign());
    }

}