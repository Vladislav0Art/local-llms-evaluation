package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        EdDSAPublicKey pubKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(pubKey);
        Assert.assertNotNull(keyPair.getAccountId());
    }

}