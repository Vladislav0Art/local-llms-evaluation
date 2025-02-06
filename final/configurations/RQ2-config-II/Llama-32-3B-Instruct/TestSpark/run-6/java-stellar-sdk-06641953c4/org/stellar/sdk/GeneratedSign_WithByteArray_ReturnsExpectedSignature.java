package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSign_WithByteArray_ReturnsExpectedSignature {

    @Test
    public void sign_WithByteArray_ReturnsExpectedSignature() throws SignatureException {
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = Mockito.mock(byte[].class);
        when(publicKey.sign(data)).thenReturn(signature);
        KeyPair keyPair = new KeyPair(mockPublickey);
        byte[] resultSignature = keyPair.sign(data);
        assertNotNull(resultSignature);
    }

}