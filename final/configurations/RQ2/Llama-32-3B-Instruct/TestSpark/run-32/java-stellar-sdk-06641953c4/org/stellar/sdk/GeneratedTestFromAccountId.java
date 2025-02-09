package org.stellar.sdk;

import org.junit.Test;

import java.security.KeyPair;
import java.util.Arrays;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        String accountId = "R5P7J2V9CQX3F2G2U3X5";
        KeyPair keyPair = new FromAccountId().fromAccountId(accountId);
    }

}