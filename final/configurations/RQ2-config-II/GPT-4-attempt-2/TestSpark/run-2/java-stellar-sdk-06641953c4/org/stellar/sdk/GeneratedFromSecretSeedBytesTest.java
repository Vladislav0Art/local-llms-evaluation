package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedBytesTest {

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] seed = {'s', 'e', 'e', 'd'};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

}