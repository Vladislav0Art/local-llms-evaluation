package org.stellar.sdk;

import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedFromSecretSeedTest {

    @Test
    public void fromSecretSeedTest() {
        KeyPair keyPair1 = KeyPair.fromSecretSeed("TestKeyPairs");
        KeyPair keyPair2 = KeyPair.fromSecretSeed("TestKeyPairs".toCharArray());
        Assert.assertEquals(keyPair1.getAccountId(), keyPair2.getAccountId());
    }

}