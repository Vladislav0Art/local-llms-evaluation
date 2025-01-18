package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedCharTest {

    @Test
    public void fromSecretSeedCharTest() {
        char[] seed = {'s', 'e', 'c', 'r', 'e', 't'};
        KeyPair keypair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keypair);
    }

}