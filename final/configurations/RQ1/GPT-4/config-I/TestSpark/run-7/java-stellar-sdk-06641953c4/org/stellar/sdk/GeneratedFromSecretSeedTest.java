package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

import static org.junit.Assert.assertTrue;

public class GeneratedFromSecretSeedTest {

    @Test
    public void fromSecretSeedTest() {
        char[] seed = "SB6MJOG3ERDBV34AZI6WFS6Y2JI4W3LDMX3GCLVZ526536JZ3SC54ZPA".toCharArray();
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

}