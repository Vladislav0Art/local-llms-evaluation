package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] signed = keyPair.sign("test".getBytes());
        Assert.assertNotNull(signed);
    }

}