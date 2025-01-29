package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAccountId_SmallAccountId {

    @Test
    public void testGetAccountId_SmallAccountId() {
        String smallAccountNumber = "small_account_number";
        KeyPair keyPair = KeyPair.fromAccountId(smallAccountNumber);
        assertEquals(smallAccountNumber, keyPair.getAccountId());
    }

}