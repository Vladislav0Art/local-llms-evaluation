package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedWithCharArrayTest {

    @Test
    public void fromSecretSeedWithCharArrayTest() {
        char[] seed = new char[]{'s', 'e', 'e', 'd'};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

}