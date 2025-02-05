package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromBip39SeedValidTest {

    @Test
    public void fromBip39SeedValidTest() {
        byte[] bip39Seed = "667842aedbdc0b1f186ceede05a3ffff".getBytes();
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);
        assertNotNull(keyPair);
    }

}