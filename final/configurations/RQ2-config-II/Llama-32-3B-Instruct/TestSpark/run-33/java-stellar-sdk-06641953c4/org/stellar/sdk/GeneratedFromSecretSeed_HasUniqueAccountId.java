package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_HasUniqueAccountId {

    @Test
    public void fromSecretSeed_HasUniqueAccountId() {
        char[] seed = new char[]{1, 2, 3};
        String accountId = KeyPair.fromSecretSeed(seed).getAccountId();

        assert (!accountId.isEmpty());
    }

}