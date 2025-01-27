package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountId_AccountIdWorks {

    @Test
    public void fromAccountId_AccountIdWorks() throws IOException, GeneralSecurityException {
        KeyPair keyPair = KeyPair.fromAccountId("account1");
        assertNotNull(keyPair.getPublicKey());
    }

}