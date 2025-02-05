package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = "abcdef".getBytes();
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);
        assertNotNull(keyPair);
    }

}