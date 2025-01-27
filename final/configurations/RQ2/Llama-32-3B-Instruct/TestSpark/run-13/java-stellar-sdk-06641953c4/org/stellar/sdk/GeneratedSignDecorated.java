package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSignDecorated {

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @Mock
    private EdDSADecoder decoderMock;

    @Test
    public void signDecorated() {
        KeyPair keyPair = new KeyPair(publicKeyMock);
        byte[] data = new byte[]{1, 2, 3};
        DecoratedSignature signature = keyPair.signDecorated(data);
        assertNotNull(signature);
    }

}