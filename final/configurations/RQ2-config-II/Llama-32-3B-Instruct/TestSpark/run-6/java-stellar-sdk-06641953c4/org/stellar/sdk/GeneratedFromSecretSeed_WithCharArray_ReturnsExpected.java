package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_WithCharArray_ReturnsExpected {

    @Test
    public void fromSecretSeed_WithCharArray_ReturnsExpected() {
        char[] seed = "hello".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}