package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[0], 0);
        assertNotNull(keyPair);
    }

}