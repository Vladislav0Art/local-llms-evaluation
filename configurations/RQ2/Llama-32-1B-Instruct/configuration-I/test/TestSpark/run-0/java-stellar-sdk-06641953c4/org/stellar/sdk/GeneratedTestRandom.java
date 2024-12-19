package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}