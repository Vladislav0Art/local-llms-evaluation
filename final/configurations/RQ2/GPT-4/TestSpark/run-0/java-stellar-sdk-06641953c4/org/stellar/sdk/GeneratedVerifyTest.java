package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        byte[] data = "data".getBytes();
        byte[] signature = new byte[64];
        Assert.assertFalse(keyPair.verify(data, signature));
    }

}