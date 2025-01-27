package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromPublicKey_GivenValidPublickey_ReturnsKeyPair {

    @Test
    public void fromPublicKey_GivenValidPublickey_ReturnsKeyPair() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, (byte) 0);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}