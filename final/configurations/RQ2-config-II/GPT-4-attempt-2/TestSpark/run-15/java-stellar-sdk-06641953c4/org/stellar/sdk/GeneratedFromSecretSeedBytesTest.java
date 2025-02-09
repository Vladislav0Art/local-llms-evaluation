package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedFromSecretSeedBytesTest {

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] seed = "TestSeed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

}