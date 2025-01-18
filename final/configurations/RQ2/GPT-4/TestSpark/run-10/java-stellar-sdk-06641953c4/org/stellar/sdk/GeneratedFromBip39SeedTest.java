package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] seed = "secret".getBytes();
        KeyPair keypair = KeyPair.fromBip39Seed(seed, 0);
        assertNotNull(keypair);
    }

}