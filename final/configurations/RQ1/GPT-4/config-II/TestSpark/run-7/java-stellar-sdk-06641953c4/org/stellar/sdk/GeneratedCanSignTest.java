package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        // Test method "canSign"
        // Here, it is expected that the private key is null,
        // hence the result for canSign should be false
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertFalse(keyPair.canSign());
    }

}