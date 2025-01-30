package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] secretSeed = {'S', 'C', '2', 'D', 'K', '5', 'E', '6', 'F', 'K'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair);
    }

}