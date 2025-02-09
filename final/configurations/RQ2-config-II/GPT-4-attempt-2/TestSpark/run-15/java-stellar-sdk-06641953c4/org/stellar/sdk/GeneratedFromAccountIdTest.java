package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        KeyPair keyPairFromAccountId = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPairFromAccountId);
    }

}