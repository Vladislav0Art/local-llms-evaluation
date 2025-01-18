package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetKeyPairFromXdrPublicKeyTest {

    @Test
    public void getKeyPairFromXdrPublicKeyTest() {
        PublicKey publicKey = new PublicKey();
        Assert.assertNotNull(KeyPair.fromXdrPublicKey(publicKey));
    }

}