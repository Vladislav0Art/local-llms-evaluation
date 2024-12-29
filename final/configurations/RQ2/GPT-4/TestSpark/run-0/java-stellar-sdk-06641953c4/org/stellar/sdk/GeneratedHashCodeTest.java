package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        int hashCode = keyPair.hashCode();
        Assert.assertEquals(keyPair.hashCode(), hashCode);
    }

}