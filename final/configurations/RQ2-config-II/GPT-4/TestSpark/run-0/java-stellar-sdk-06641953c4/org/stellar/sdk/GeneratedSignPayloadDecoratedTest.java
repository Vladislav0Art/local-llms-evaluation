package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.mockito.Mockito.mock;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair pair = KeyPair.random();
        byte[] signerPayload = "test".getBytes();
        DecoratedSignature signature = pair.signPayloadDecorated(signerPayload);
        Assert.assertNotNull(signature);
    }

}