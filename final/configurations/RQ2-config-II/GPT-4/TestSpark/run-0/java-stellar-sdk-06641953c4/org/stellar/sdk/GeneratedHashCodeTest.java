package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.mockito.Mockito.mock;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair pair1 = KeyPair.random();
        KeyPair pair2 = KeyPair.random();
        Assert.assertNotEquals(pair1.hashCode(), pair2.hashCode());
    }

}