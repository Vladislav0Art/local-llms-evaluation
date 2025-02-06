package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetPublicKey_NoValue_ReturnsNull {

    @Test
    public void getPublicKey_NoValue_ReturnsNull() {
        KeyPair keyPair = new KeyPair(null);
        assertNull(keyPair.getPublicKey());
    }

}