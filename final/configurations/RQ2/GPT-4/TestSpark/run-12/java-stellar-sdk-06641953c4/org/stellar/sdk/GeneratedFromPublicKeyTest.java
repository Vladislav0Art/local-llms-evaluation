package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = "publicKey".getBytes();
        Assert.assertNotNull(KeyPair.fromPublicKey(publicKey));
    }

}