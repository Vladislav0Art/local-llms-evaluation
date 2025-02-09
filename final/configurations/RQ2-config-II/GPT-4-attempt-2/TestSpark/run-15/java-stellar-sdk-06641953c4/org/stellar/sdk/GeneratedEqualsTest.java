package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair = KeyPair.random();
        boolean result = keyPair.equals(keyPair);
        Assert.assertTrue(result);
    }

}