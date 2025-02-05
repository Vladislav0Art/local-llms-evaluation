package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.mockito.Mockito.mock;

public class GeneratedGetXdrSignerKeyTest {

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair pair = KeyPair.random();
        SignerKey signerKey = pair.getXdrSignerKey();
        Assert.assertNotNull(signerKey);
    }

}