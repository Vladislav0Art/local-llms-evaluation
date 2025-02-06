package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAccountId_InvalidInput_ReturnsNull {

    @Test
    public void getAccountId_InvalidInput_ReturnsNull() {
        KeyPair keyPair = new KeyPair(null);
        assertNull(keyPair.getAccountId());
    }

}