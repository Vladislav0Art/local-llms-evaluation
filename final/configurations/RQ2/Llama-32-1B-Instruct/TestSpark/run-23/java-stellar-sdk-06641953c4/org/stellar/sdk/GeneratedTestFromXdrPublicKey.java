package org.stellar.sdk;

import org.junit.jupiter.api.Test;

public class GeneratedTestFromXdrPublicKey {

    public static byte[] generatePublicKey() {
        // Public key generation logic...
        return new byte[]{1, 2, 3, 4};
    }

    @Test
    public void testFromXdrPublicKey() {
        byte[] publicKey = generatePublicKey();
        PublicKey fromXdrPublicKey = KeyPair.fromXdrPublicKey(publicKey);
        assert !fromXdrPublicKey.equals(null);
    }

}