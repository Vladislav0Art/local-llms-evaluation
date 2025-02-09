package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey key = keyPair.getXdrPublicKey();
        KeyPair newKeyPair = KeyPair.fromXdrPublicKey(key);
        Assert.assertEquals(keyPair, newKeyPair);
    }

}