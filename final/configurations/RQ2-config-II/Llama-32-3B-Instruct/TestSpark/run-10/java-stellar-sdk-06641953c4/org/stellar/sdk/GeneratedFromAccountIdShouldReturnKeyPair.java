package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromAccountIdShouldReturnKeyPair {

    @Test
    public void fromAccountIdShouldReturnKeyPair() {
        String accountId = Mockito.mock(String.class);
        byte[] expectedPublicKey = new byte[]{1, 2, 3};
        when(accountId).equals("account123").thenReturn(true);
        assertEquals(KeyPair.fromAccountId(accountId), new KeyPair(expectedPublicKey));
    }

}