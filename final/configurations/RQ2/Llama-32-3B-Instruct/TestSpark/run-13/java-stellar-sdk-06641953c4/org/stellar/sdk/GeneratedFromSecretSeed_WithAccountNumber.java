package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_WithAccountNumber {

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @Mock
    private EdDSADecoder decoderMock;

    @Test
    public void fromSecretSeed_WithAccountNumber() {
        when(decoderMock.decode(accountId)).thenReturn(publicKeyMock);
        char[] seed = "12-34-56".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed, 1);
        assertNotNull(keyPair);
    }

}