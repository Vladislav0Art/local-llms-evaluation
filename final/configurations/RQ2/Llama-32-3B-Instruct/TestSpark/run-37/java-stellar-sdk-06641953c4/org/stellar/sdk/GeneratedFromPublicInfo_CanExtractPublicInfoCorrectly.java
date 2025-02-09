package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromPublicInfo_CanExtractPublicInfoCorrectly {

    @Test
    public void fromPublicInfo_CanExtractPublicInfoCorrectly() {
        // Arrange
        byte[] publicKey = "my_public_key".getBytes();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(new PublicKey(keyType -> publicKey));

        // Act and Assert
        assertTrue(Arrays.equals(keyPair.getPublicKey(), publicKey));
    }

}