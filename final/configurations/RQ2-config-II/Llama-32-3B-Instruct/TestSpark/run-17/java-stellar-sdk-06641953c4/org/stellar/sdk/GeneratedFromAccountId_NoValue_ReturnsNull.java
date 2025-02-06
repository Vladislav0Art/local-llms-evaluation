package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromAccountId_NoValue_ReturnsNull {

    @Test
    public void fromAccountId_NoValue_ReturnsNull() {
        KeyPair keyPair = KeyPair.fromAccountId(null);
        assertNull(keyPair);
    }

}