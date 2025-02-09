package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.Uint256;

import java.util.Random;

public class GeneratedFromAccountIdTest {

    final static String HASHED_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXX"; // the hashed public key

    @Test
    public void fromAccountIdTest() {
        final String accountId = "GD6GHEOWRHVLVZATJDRS3CQ447PWRO2GO6KQ7BSTRUEGO2ZFVLZ7D3PL";
        final KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPair);
    }

}