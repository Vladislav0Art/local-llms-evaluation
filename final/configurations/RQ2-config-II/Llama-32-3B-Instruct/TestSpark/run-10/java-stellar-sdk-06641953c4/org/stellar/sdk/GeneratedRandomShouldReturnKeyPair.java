package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRandomShouldReturnKeyPair {

    @Test
    public void randomShouldReturnKeyPair() {
        assertNotEquals(0, new KeyPair(random()).hashCode());
    }

}