package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedGenerateKeyPair_GivenAccountId_ReturnsCorrectKeyPair {

    @Test
    public void generateKeyPair_GivenAccountId_ReturnsCorrectKeyPair() throws NoSuchAlgorithmException, GeneralSecurityException {
        String accountId = "my_account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(2, keyPair.getPublicKey().getEncodedLength());
        assertEquals(32, keyPair.getSignerKey().getEncodedLength());
    }

}