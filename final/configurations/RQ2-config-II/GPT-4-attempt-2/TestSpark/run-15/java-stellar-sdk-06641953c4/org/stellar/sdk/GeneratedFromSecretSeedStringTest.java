package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "TestSeed";
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair1);
        Assert.assertTrue(keyPair1.canSign());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            KeyPair.fromSecretSeed((String) null);
        });
    }

}