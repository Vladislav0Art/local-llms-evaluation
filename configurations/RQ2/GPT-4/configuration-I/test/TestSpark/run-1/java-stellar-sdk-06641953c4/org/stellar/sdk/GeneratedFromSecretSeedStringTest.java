package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.PublicKey;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "abc";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}