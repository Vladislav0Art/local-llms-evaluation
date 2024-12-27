package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.PublicKey;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}