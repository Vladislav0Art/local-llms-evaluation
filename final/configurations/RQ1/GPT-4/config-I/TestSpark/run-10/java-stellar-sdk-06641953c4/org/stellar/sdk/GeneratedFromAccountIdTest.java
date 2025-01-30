package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        KeyPair expectedKeyPair = KeyPair.random();
        String expectedAccountId = expectedKeyPair.getAccountId();
        KeyPair actualKeyPair = KeyPair.fromAccountId(expectedAccountId);
        assertEquals(expectedKeyPair.getAccountId(), actualKeyPair.getAccountId());
    }

}