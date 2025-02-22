package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import org.junit.Test;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        String accountId = "GB6FW65CW2B63T45YECCO67X6DJT6GD8F6JU65F7KIUNGU2G42B437W2";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

}