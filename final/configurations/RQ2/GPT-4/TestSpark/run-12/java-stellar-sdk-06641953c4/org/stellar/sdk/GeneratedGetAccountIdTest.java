package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(null);
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertNotNull(keyPair.getAccountId());
    }

}