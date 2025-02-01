package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.SignatureHint;

import java.security.GeneralSecurityException;
import java.security.SignatureException;
import java.util.Arrays;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        String accountId = "testAccountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        Assert.assertEquals(accountId, keyPair.getAccountId());
    }

}