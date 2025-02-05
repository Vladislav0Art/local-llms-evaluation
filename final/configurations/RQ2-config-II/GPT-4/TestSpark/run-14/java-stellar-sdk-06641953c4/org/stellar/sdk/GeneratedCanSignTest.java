package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        EdDSAPublicKey pubKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(pubKey);
        Assert.assertFalse(keyPair.canSign());
    }

}