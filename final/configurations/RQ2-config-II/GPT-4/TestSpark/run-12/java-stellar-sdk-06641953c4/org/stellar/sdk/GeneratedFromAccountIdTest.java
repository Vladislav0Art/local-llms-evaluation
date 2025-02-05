package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "SomeRandomAccountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertEquals(accountId, keyPair.getAccountId());
    }

}