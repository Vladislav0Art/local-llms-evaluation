package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String secretSeed = "abcdef";
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair);
    }

}