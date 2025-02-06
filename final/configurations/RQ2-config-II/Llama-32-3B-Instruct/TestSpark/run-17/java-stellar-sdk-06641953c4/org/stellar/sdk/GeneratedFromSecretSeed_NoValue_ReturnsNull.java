package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromSecretSeed_NoValue_ReturnsNull {

    @Test
    public void fromSecretSeed_NoValue_ReturnsNull() {
        KeyPair keyPair = KeyPair.fromSecretSeed(null);
        assertNull(keyPair);
    }

}