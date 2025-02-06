package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_WithByteArray_ReturnsExpected {

    @Test
    public void fromSecretSeed_WithByteArray_ReturnsExpected() {
        byte[] seed = "hello".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}