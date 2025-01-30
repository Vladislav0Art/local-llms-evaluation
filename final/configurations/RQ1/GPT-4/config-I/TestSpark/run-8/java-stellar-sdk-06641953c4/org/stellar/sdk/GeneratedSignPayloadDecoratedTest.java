package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.StrKey;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "test data".getBytes(StandardCharsets.UTF_8);
        DecoratedSignature signature = keyPair.signPayloadDecorated(data);
        Assert.assertNotNull(signature);
    }

}