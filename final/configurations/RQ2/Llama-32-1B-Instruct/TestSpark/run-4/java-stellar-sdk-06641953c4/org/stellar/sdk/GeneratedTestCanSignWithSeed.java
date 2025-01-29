package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCanSignWithSeed {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testCanSignWithSeed() {
        when(mockEdDSAEngine.generateEddsaFromSecretseed("some_secret_seed").thenReturn(mockEdDSAPublicKey));
        assertTrue(KeyPair.canSign());
    }

}