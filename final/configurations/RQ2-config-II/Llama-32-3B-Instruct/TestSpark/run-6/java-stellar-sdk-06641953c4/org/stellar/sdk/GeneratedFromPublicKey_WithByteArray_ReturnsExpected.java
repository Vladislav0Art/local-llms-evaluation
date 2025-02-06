package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromPublicKey_WithByteArray_ReturnsExpected {

    @Test
    public void fromPublicKey_WithByteArray_ReturnsExpected() {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}