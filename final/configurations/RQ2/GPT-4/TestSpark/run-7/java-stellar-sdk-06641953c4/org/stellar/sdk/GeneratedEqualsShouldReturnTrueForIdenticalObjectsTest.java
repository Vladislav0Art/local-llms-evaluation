package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;

public class GeneratedEqualsShouldReturnTrueForIdenticalObjectsTest {

    @Test
    public void equalsShouldReturnTrueForIdenticalObjectsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = keyPair1;
        Assert.assertEquals(keyPair1, keyPair2);
    }

}