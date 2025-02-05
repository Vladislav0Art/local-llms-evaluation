package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.*;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SAMPLESECRETSEED>";

        try {
            KeyPair keyPair = KeyPair.fromSecretSeed(seed);
            assertNotNull(keyPair);
        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }

}