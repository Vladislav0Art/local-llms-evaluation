package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        byte[] data = "Test data".getBytes(StandardCharsets.UTF_8);
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

}