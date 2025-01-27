package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedGetAccountId {

    @Test
    public void getAccountId() {
        String accountId = "account123"; // hardcoded for simplicity
        KeyPair keyPair = new KeyPair(null); // constructor not used here, just a placeholder
        assertEquals(accountId, keyPair.getAccountId());
    }

}