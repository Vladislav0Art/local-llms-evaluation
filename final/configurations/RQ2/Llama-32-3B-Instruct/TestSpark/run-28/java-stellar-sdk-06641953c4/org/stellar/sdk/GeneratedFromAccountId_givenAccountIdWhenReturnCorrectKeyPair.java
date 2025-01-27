package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedFromAccountId_givenAccountIdWhenReturnCorrectKeyPair {

    @Test
    public void fromAccountId_givenAccountIdWhenReturnCorrectKeyPair() {
        String accountId = "account123"; // hardcoded for simplicity
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair.getPublicKey());
    }

}