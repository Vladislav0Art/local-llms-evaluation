package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import static org.junit.Assert.*;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = {1, 2, 3, 4, 5};
        int accountNumber = 1;
        assertNotNull(KeyPair.fromBip39Seed(bip39Seed, accountNumber));
    }

}