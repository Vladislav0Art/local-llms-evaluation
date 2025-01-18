package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[]{1, 2, 3}, 1);
        Assert.assertNotNull(keyPair);
    }

}