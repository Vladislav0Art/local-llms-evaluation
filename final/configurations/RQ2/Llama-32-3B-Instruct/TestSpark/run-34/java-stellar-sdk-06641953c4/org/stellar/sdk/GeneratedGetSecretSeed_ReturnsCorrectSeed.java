package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetSecretSeed_ReturnsCorrectSeed {

    @Mock
    private EdDSAPrivateKey edDsaprivateKey;

    @Mock
    private EdDSAEngine edDsaEngine;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(edDsaEngine.getEdDspRng()).thenReturn(new byte[]{1, 2, 3});
    }

    @Test
    public void getSecretSeed_ReturnsCorrectSeed() {
        char[] seed = "1234567890";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(seed, keyPair.getSecretSeed());
    }

}