package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[]{1, 2, 3};
        Assert.assertNotNull(keyPair.signPayloadDecorated(data));
    }

}