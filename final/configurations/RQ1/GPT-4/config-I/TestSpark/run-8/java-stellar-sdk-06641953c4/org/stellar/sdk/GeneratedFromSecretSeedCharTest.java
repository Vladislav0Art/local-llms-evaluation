package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedFromSecretSeedCharTest {

    @Test
    public void fromSecretSeedCharTest() {
        char[] seed = "SC35MLOO5MTOGSYVEQVJOSXX4CBS55ZNHP5D5QBIUZSG2DSJYZFNFN7E".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

}