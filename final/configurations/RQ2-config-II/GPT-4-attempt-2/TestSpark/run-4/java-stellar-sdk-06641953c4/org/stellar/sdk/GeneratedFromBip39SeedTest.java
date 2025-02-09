package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        KeyPair pair = KeyPair.fromBip39Seed("seed".getBytes(), 0);
        Assert.assertNotNull(pair);
    }

}