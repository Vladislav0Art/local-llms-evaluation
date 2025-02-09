package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getAccountId());
    }

}