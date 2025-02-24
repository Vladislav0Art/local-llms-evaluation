package org.stellar.sdk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(/* some public key */);
        assertEquals("expected account id", keyPair.getAccountId());
    }

}