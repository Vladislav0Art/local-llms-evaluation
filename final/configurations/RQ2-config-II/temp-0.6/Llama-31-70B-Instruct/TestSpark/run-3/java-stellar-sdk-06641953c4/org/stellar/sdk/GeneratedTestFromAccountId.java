package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = KeyPair.fromAccountId("test");
        Assert.assertNotNull(keyPair);
    }

}