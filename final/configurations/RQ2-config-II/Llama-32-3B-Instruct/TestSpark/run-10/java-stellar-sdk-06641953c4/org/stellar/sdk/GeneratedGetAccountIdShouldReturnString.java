package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetAccountIdShouldReturnString {

    @Test
    public void getAccountIdShouldReturnString() {
        byte[] expectedAccount = "account123".getBytes();
        when(new KeyPair(expectedAccount)).getAccountId().thenReturn("account123");
        assertEquals("account123", new KeyPair(expectedAccount).getAccountId());
    }

}