package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = "bip39seed".getBytes();
        assertNotNull(KeyPair.fromBip39Seed(bip39Seed, 1));
    }

}