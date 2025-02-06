package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "XED4B6G2F8A2JG3L9C7P1H5T6V3D4";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}