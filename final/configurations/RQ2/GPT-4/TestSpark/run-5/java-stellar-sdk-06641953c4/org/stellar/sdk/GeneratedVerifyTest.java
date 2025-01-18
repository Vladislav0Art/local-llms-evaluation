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
public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        byte[] data = "Hello world".getBytes();
        KeyPair pair = KeyPair.random();
        byte[] signature = pair.sign(data);
        assertTrue(pair.verify(data, signature));
    }

}