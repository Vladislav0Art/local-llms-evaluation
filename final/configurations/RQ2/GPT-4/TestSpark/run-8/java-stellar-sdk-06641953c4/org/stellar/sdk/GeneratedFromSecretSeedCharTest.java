package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedCharTest {

    @Test
    public void fromSecretSeedCharTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'a', 'b', 'c'});
        Assert.assertNotNull(keyPair);
    }

}