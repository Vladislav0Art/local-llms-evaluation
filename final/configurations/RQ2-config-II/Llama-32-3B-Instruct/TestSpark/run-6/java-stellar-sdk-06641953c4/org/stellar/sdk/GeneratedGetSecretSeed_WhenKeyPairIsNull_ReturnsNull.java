package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetSecretSeed_WhenKeyPairIsNull_ReturnsNull {

    @Test
    public void getSecretSeed_WhenKeyPairIsNull_ReturnsNull() {
        KeyPair keyPair = null;
        assertNull(keyPair.getSecretSeed());
    }

}