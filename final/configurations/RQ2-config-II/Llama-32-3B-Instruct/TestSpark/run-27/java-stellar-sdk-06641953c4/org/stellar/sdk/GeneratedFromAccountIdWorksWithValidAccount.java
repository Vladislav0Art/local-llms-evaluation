package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.lang.System.arraycopy;

public class GeneratedFromAccountIdWorksWithValidAccount {

    @Test
    public void fromAccountIdWorksWithValidAccount() {
        String accountId = "account-id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair.getAccountId());
    }

}