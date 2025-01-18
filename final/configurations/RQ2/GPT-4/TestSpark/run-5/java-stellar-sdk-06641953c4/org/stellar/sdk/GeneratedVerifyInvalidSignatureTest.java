package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVerifyInvalidSignatureTest {

    @Test
    public void verifyInvalidSignatureTest() {
        KeyPair pair = KeyPair.random();
        assertFalse(pair.verify("Hello world".getBytes(), "InvalidSignature".getBytes()));
    }

}