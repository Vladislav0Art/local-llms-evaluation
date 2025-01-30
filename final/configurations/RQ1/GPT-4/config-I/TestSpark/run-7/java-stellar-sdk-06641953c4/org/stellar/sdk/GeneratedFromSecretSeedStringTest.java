package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

import static org.junit.Assert.assertTrue;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seedString = "SB6MJOG3ERDBV34AZI6WFS6Y2JI4W3LDMX3GCLVZ526536JZ3SC54ZPA";
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.fromSecretSeed(seedString);
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

}