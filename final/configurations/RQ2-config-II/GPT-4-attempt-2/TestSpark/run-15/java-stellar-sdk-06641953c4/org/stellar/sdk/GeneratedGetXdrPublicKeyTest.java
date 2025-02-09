package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey key = PublicKey.keyPairToPublicKey(keyPair);
        Assert.assertNotNull(key);
    }

}