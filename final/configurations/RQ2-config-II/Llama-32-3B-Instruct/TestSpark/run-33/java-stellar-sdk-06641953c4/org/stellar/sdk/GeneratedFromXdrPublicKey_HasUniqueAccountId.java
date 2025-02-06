package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromXdrPublicKey_HasUniqueAccountId {

    @Test
    public void fromXdrPublicKey_HasUniqueAccountId() {
        PublicKey key = new PublicKey();
        String accountId1 = KeyPair.fromXdrPublicKey(key).getAccountId();
        String accountId2 = KeyPair.fromXdrPublicKey(key).getAccountId();

        assertNotEquals(accountId1, accountId2);
    }

}