package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertEquals(keyPair1, keyPair1);
        Assert.assertNotEquals(keyPair1, keyPair2);
    }

}