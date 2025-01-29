package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.XdrDataOutputStream;
import org.stellar.sdk.XdrDataInputStream;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() throws Exception {
        String bip39Seed = "bip39_seed";
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed);
        assertNotNull(keyPair.getSecretSeed());
    }
}

}