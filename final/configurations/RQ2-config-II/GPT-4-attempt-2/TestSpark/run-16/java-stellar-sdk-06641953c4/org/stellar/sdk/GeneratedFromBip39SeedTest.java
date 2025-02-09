package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.SecureRandom;

import static org.junit.Assert.*;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] seed = new SecureRandom().generateSeed(20);
        KeyPair keyPair = KeyPair.fromBip39Seed(seed, 1);
        assertNotNull(keyPair);
    }

}