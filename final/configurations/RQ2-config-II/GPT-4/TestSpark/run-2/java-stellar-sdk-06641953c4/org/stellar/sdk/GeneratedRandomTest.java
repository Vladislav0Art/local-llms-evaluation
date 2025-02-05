package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair result = KeyPair.random();
        assertNotNull(result);
    }

}