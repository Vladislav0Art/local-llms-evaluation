package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedKeyPairConstructionTest {

    @Test
    public void KeyPairConstructionTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}