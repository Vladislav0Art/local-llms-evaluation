package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVerify_WithByteArrayAndSignature_ReturnsTrue {

    @Test
    public void verify_WithByteArrayAndSignature_ReturnsTrue() throws SignatureException {
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = Mockito.mock(byte[].class);
        when(publicKey.verify(data)).thenReturn(true);
        KeyPair keyPair = new KeyPair(mockPublickey);
        boolean resultVerify = keyPair.verify(data, signature);
        assertTrue(resultVerify);
    }

}