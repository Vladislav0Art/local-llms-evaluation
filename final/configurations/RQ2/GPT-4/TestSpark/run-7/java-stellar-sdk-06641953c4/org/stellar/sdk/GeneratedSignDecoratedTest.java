package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;

public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        byte[] data = "Test data".getBytes(StandardCharsets.UTF_8);
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature signature = keyPair.signDecorated(data);
        Assert.assertNotNull(signature);
    }

}