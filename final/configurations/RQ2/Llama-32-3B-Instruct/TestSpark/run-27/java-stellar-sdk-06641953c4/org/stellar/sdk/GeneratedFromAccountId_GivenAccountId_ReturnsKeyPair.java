package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromAccountId_GivenAccountId_ReturnsKeyPair {

    @Test
    public void fromAccountId_GivenAccountId_ReturnsKeyPair() {
        String accountId = "my_account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}