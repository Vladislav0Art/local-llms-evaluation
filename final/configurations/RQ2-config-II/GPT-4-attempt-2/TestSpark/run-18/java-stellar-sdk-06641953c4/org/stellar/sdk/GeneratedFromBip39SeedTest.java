package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = new byte[32];
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 0);
        Assert.assertNotNull(keyPair);
    }

}