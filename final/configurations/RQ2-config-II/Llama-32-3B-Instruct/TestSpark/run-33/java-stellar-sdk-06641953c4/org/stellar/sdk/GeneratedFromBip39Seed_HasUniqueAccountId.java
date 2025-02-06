package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromBip39Seed_HasUniqueAccountId {

    @Test
    public void fromBip39Seed_HasUniqueAccountId() {
        byte[] bip39Seed = new byte[]{1, 2, 3};
        byte[] accountNumber = new byte[]{4, 5, 6};

        String accountId1 = KeyPair.fromBip39Seed(bip39Seed, accountNumber).getAccountId();
        String accountId2 = KeyPair.fromBip39Seed(bip39Seed, accountNumber).getAccountId();

        assertNotEquals(accountId1, accountId2);
    }

}