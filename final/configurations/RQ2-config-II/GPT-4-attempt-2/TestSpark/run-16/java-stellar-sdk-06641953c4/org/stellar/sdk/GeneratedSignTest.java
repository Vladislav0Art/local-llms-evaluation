package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.SecureRandom;

import static org.junit.Assert.*;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "test".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

}