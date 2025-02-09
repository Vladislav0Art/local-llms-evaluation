package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = {1, 2, 3, 4, 5};
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotEquals(null, keyPair);
    }

}