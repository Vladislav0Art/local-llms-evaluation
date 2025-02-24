package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[32], 0);
        Assert.assertNotNull(keyPair);
    }

}