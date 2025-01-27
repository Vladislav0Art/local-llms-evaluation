package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetAccountId_GivenKeyPair_ReturnsAccountId {

    @Test
    public void getAccountId_GivenKeyPair_ReturnsAccountId() {
        String accountId = "my_account_id";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(accountId));
        assertEquals(accountId, keyPair.getAccountId());
    }

}