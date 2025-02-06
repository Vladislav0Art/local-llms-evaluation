package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetAccountId_ReturnsCorrectAccountId {

    @Test
    public void getAccountId_ReturnsCorrectAccountId() {
        String accountId = "account123";
        KeyPair keyPair = new KeyPair(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

}