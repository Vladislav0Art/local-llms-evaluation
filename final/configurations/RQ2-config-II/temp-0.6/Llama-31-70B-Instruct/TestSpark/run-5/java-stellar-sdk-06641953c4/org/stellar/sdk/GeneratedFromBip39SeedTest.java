package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = new byte[0];
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 0);
        assertNotNull(keyPair);
    }

}