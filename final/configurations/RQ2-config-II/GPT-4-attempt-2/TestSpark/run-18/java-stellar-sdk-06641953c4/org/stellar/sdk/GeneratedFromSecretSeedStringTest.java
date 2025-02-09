package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SBRMFGK2JKKISFJGHG2BNAOGK5ETSIJYBMMYJUMZM7LFYBQ7FQ";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

}