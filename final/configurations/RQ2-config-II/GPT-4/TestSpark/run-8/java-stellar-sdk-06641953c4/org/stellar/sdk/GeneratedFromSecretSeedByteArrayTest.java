package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] secretSeed = "abcdef".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair);
    }

}