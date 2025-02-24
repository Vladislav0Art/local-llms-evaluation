package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        KeyPair keyPair = KeyPair.fromSecretSeed("test");
        Assert.assertNotNull(keyPair);
    }

}