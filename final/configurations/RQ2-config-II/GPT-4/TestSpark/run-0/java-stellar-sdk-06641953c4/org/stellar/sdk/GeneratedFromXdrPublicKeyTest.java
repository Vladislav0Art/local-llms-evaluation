package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.mockito.Mockito.mock;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair originalPair = KeyPair.random();
        PublicKey key = originalPair.getXdrPublicKey();
        KeyPair pair = KeyPair.fromXdrPublicKey(key);
        Assert.assertEquals(originalPair, pair);
    }

}