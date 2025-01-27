package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromXdrPublicKey_GivenValidPublickey_ReturnsKeyPair {

    @Test
    public void fromXdrPublicKey_GivenValidPublickey_ReturnsKeyPair() {
        PublicKey publicKey = new PublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}