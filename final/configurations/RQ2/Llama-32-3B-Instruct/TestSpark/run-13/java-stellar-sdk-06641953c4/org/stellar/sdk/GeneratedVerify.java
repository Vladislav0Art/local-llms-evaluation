package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVerify {

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @Mock
    private EdDSADecoder decoderMock;

    @Test
    public void verify() {
        KeyPair keyPair = new KeyPair(publicKeyMock);
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = new byte[]{4, 5, 6};
        assertTrue(keyPair.verify(data, signature));
    }

}