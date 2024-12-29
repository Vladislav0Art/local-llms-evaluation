package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        Assert.assertNotNull(keyPair.getAccountId());
    }

}