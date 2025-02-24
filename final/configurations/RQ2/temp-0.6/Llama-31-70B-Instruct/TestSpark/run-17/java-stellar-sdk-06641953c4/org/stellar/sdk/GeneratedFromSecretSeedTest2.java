package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedFromSecretSeedTest2 {

    @Test
    public void fromSecretSeedTest2() throws Exception {
        String seed = "abc";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair.getSecretSeed(), seed.toCharArray());
    }

}