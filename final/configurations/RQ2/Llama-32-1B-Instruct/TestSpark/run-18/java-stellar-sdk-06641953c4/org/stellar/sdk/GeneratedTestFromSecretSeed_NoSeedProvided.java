package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestFromSecretSeed_NoSeedProvided {

    @Test
    public void testFromSecretSeed_NoSeedProvided() {
        byte[] seed = new byte[0];
        KeyPair keyPair = fromSecretSeed(seed);
        assert keyPair == null : "Key pair created with invalid seed";
    }

}