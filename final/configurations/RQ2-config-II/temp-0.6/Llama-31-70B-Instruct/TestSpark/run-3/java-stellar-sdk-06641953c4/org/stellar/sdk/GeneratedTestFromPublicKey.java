package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTestFromPublicKey {

    @Test
    public void testFromPublicKey() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[32]);
        Assert.assertNotNull(keyPair);
    }

}