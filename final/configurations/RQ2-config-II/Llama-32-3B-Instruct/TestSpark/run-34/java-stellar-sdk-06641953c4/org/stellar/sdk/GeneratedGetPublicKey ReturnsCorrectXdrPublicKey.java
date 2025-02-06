package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetPublicKey ReturnsCorrectXdrPublicKey {

    @Test
    public void getPublicKey

    ReturnsCorrectXdrPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublickey(publicKey);
        assertNotNull(keyPair.getXdrPublicKey());
        assertTrue(Arrays.equals(publicKey, keyPair.getXdrPublicKey().getBytes()));
    }

}