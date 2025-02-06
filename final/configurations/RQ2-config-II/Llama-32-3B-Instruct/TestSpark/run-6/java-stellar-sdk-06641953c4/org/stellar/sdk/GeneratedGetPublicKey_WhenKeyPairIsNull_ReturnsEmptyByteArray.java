package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPublicKey_WhenKeyPairIsNull_ReturnsEmptyByteArray {

    @Test
    public void getPublicKey_WhenKeyPairIsNull_ReturnsEmptyByteArray() {
        KeyPair keyPair = null;
        assertTrue(Arrays.equals(keyPair.getPublicKey(), new byte[0]));
    }

}