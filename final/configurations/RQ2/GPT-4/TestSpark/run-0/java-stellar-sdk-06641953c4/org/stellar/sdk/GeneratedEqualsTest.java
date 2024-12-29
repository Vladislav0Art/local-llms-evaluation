package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        String seed = "seed";
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed.getBytes());
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed.getBytes());
        Assert.assertTrue(keyPair1.equals(keyPair2));
    }

}