package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCreateKeyPairFromAccountIdAndSeedShouldReturnTrue {

    @Test
    public void createKeyPairFromAccountIdAndSeedShouldReturnTrue() {
        String accountId = "test_account";
        byte[] seed = new byte[32];
        assertTrue(KeyPair.fromSecretSeed(seed).equals(KeyPair.fromAccountId(accountId)));
    }

}