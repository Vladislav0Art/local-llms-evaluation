package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedFromSecretSeedTest3 {

    @Test
    public void fromSecretSeedTest3() throws Exception {
        byte[] seed = new byte[]{(byte) 'a', (byte) 'b', (byte) 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair.getPublicKey(), seed);
    }

}