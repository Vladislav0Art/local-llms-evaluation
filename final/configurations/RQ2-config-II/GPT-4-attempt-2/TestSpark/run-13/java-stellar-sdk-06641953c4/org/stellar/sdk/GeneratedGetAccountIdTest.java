package org.stellar.sdk;

import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getAccountId());
    }

}