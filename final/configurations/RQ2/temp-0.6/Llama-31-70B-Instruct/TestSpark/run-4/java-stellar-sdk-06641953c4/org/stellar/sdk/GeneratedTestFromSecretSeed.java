package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        char[] seed = "SDBXZH4NZRVJRIKT6KT7DB52OUNKILFSUGFW7N2PQ2B37ZYDYJT3ULFU".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals("GDJFHQFQC566IB4Z3TJ7F3H5U6CYSHOREPWVWYYKQ6EX6SJKKGROZILT", keyPair.getAccountId());
    }

}