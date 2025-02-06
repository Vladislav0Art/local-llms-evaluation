package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRandomWorks {

    @Test
    public void randomWorks() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}