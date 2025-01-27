package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeed_WorksWithBip39Seed {

    @Test
    public void fromSecretSeed_WorksWithBip39Seed() throws Exception {
        // Arrange
        byte[] bip39Seed = new byte[16];
        Arrays.fill(bip39Seed, (byte) 0x01);
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);

        // Act and Assert
        assertNotNull(keyPair);
    }

}