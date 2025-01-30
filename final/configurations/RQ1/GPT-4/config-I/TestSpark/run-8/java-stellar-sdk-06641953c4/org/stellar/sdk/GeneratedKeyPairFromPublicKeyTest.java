package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedKeyPairFromPublicKeyTest {

    @Test
    public void keyPairFromPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        KeyPair keyPairFromPublicKey = KeyPair.fromPublicKey(keyPair.getPublicKey());
        Assert.assertFalse(keyPairFromPublicKey.canSign());
        Assert.assertEquals(keyPair.getAccountId(), keyPairFromPublicKey.getAccountId());
    }

}