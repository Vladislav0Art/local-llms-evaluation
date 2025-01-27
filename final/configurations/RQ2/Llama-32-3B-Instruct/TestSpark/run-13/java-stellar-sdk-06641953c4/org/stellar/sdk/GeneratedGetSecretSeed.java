package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetSecretSeed {

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @Mock
    private EdDSADecoder decoderMock;

    @Test
    public void getSecretSeed() {
        KeyPair keyPair = new KeyPair(publicKeyMock);
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

}