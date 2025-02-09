package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.SecureRandom;

import static org.junit.Assert.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "test".getBytes();
        byte[] wrongSignature = "wrongSignature".getBytes();
        assertFalse(keyPair.verify(data, wrongSignature));
    }

}