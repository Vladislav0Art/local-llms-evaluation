package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "GBH4TZYZ4IRCPO44CBOLFUHULU2WGALXTAVESQA6432MBJMABBB4GIYI";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPair);
    }

}