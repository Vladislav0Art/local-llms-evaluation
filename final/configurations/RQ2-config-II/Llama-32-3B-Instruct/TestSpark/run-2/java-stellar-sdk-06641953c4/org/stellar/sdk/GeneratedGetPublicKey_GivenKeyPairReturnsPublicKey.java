package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedGetPublicKey_GivenKeyPairReturnsPublicKey {

    @Test
    public void getPublicKey_GivenKeyPairReturnsPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(publicKey));
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}