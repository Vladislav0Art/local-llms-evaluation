package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromAccountId_NoAccountFoundTest {

    @Test
    public void fromAccountId_NoAccountFoundTest() {
        assertEquals("null", KeyPair.fromAccountId("test").getAccountId());
    }

}