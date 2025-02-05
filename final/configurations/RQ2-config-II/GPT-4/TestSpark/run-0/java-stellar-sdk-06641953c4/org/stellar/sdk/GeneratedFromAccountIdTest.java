package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.mockito.Mockito.mock;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "GABZUTCPW3AQUGHUY5BMYIH7GPQEL7ZCGJXSI2D6ADXVD3I3ZNKE3UAL";
        KeyPair pair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(pair);
    }

}