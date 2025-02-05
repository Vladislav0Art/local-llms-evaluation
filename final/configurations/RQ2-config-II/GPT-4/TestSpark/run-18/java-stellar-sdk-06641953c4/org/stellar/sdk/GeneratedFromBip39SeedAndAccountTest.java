package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromBip39SeedAndAccountTest {

    @Test
    public void fromBip39SeedAndAccountTest() {
        byte[] bip39Seed = new byte[64];
        int accountNumber = 5;
        assertNotNull(KeyPair.fromBip39Seed(bip39Seed, accountNumber));
    }

}