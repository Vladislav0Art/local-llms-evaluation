package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        byte[] data = "some data".getBytes();
        byte[] signature = "signature".getBytes();
        KeyPair keyPair = KeyPair.random();
        boolean result = keyPair.verify(data, signature);
        assertNotNull(result);
    }

}