package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        KeyPair pair = KeyPair.fromAccountId(keyPair.getAccountId());
        Assert.assertNotNull(pair);
        Assert.assertEquals(pair.getAccountId(), keyPair.getAccountId());
    }

}