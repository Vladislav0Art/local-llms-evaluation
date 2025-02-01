package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "Test Account Id";

        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        Assert.assertNotNull(keyPair);
        Assert.assertFalse(keyPair.canSign());
    }

}