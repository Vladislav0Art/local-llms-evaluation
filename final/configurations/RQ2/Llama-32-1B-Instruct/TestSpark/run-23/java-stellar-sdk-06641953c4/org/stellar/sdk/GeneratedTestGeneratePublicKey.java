package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGeneratePublicKey {

    @Test
    public void testGeneratePublicKey() {
        byte[] publicKey = generatePublicKey();
        EdDSAPublicKey fromXdrPublicKey = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(new byte[]{1, 2, 3, 4}, fromXdrPublicKey.publicKeyBytes());
        assertNotEquals(null, fromXdrPublicKey);
    }

    public static byte[] generatePublicKey() {
        return new byte[]{1, 2, 3, 4};
    }

}