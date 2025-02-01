package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedFromAccountIdInvalidTest {

    @Test
    public void fromAccountIdInvalidTest() {
        KeyPair.fromAccountId("invalid");
    }

}