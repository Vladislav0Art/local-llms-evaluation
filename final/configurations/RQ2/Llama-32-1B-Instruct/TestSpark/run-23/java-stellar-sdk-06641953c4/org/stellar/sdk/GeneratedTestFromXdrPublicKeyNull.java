package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestFromXdrPublicKeyNull {

    @Test
    public void testFromXdrPublicKeyNull() {
        byte[] publicKey = null;
        KeyPair fromXdrPublicKey = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(null, fromXdrPublicKey);
    }

}