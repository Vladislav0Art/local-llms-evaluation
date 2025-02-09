package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

}