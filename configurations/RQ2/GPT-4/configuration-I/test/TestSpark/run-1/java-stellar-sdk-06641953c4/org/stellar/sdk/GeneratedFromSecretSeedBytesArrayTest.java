package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.PublicKey;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class GeneratedFromSecretSeedBytesArrayTest {

    @Test
    public void fromSecretSeedBytesArrayTest() {
        byte[] seed = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}