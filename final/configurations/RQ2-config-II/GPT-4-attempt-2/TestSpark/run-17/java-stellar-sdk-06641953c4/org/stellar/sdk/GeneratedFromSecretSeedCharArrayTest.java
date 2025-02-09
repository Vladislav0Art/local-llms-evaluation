package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

}