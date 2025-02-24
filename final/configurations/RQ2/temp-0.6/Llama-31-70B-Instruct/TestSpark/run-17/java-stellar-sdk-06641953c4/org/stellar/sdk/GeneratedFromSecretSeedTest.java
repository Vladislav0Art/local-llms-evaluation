package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedFromSecretSeedTest {

    @Test
    public void fromSecretSeedTest() throws Exception {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair.getSecretSeed(), seed);
    }

}