package org.stellar.sdk;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeedStringCorrectlyHandlesInput {

    @BeforeClass
    public static void setup() {
        // Setup is not needed for this test class
    }

    @Test
    public void fromSecretSeedStringCorrectlyHandlesInput() throws Exception {
        char[] seed = "seed".toCharArray();
        when(EdDSAPrivateKeySpec.fromEncoded(seed)).thenReturn(Mockito.mock(EdDSAPrivateKeySpec.class));

        KeyPair keyPair = KeyPair.fromSecretSeed("seed");

        assertNotNull(keyPair.getAccountId());
        assertEquals(seed, keyPair.getSecretSeed());
    }

}