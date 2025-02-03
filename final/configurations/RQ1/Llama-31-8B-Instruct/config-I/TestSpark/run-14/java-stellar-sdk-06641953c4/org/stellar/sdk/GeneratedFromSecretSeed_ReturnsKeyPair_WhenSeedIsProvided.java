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
    private EdDSAPublicKeySpec publicKeySpec;

    @Mock
    private EdDSAPrivateKeySpec privateKeySpec;

    @Mock
    private EdDSANamedCurveSpec ed25519;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void fromSecretSeed_ReturnsKeyPair_WhenSeedIsProvided() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}