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
public class GeneratedFromSecretSeedBytesTest {

    @Test
    public void fromSecretSeedBytesTest() throws NoSuchAlgorithmException {
        byte[] seed = "SomeRandomSeedBytesTest".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertTrue(keyPair.canSign());
    }

}