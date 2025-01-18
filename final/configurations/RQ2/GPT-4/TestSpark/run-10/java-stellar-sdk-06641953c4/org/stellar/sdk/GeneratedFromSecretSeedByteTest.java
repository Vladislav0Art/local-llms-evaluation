package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedByteTest {

    @Test
    public void fromSecretSeedByteTest() {
        byte[] seed = "secret".getBytes();
        KeyPair keypair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keypair);
    }

}