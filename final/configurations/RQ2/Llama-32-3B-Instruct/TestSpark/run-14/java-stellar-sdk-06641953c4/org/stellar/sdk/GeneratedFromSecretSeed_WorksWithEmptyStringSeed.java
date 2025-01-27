package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeed_WorksWithEmptyStringSeed {

    @Test
    public void fromSecretSeed_WorksWithEmptyStringSeed() throws Exception {
        // Arrange
        byte[] seed = " ".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Act and Assert
        assertNotNull(keyPair);
    }

}