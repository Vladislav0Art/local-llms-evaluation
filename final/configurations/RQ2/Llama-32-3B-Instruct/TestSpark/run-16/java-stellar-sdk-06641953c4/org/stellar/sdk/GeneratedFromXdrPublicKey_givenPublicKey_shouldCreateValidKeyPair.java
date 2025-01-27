package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromXdrPublicKey_givenPublicKey_shouldCreateValidKeyPair {

    @Test
    public void fromXdrPublicKey_givenPublicKey_shouldCreateValidKeyPair() throws GeneralSecurityException {
        PublicKey key = new PublicKey();
        KeyPair key_pair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(key_pair);
    }

}