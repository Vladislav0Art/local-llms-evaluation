package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromXdrPublicKey_ReturnsCorrectKeyPair {

    @Test
    public void fromXdrPublicKey_ReturnsCorrectKeyPair() {
        PublicKey key = new PublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(keyPair.getAccountId());
    }

}