package org.stellar.sdk;

import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair result = KeyPair.fromXdrPublicKey(publicKey);
        Assert.assertEquals(keyPair, result);
    }

}