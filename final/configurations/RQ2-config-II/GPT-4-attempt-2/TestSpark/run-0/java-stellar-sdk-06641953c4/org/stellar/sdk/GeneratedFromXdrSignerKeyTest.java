package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey key = keyPair.getXdrSignerKey();
        KeyPair newKeyPair = KeyPair.fromXdrSignerKey(key);
        Assert.assertEquals(keyPair, newKeyPair);
    }

}