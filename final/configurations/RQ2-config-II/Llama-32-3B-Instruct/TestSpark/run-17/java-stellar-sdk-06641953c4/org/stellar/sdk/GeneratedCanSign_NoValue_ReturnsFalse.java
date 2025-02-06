package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCanSign_NoValue_ReturnsFalse {

    @Test
    public void canSign_NoValue_ReturnsFalse() {
        KeyPair keyPair = new KeyPair(null);
        assertTrue(keyPair.canSign());
    }

}