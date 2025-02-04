package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_ReturnsKeyPair_WhenSeedIsProvided {

    @Mock
    private EdDSAPublicKey publicKey;

    @Mock
    private EdDSAPrivateKey privateKey;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void fromSecretSeed_ReturnsKeyPair_WhenSeedIsProvided() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}