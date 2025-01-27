package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

public class Generated[Verify][ValidSignature]

Test {

    @Test
    public void [Verify][ValidSignature]Test() throws Exception {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed".toCharArray());
        byte[] data = "data".getBytes();
        byte[] signature = ((EdDSAPrivateKey) keyPair.getPrivateKey()).sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

}