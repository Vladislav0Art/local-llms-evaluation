package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

public class Generated[Equals][SameObject]

Test {

    @Test
    public void [Equals][SameObject]Test() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(KeyPair.equals(keyPair, keyPair));
    }

}