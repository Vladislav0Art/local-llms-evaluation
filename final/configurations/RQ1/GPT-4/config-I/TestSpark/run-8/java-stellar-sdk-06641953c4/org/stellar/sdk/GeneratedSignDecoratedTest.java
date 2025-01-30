package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "stellar".getBytes(StandardCharsets.UTF_8);
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        byte[] hint = decoratedSignature.getHint().getSignatureHint();
        byte[] last4BytesPublicKey = Arrays.copyOfRange(keyPair.getPublicKey(), keyPair.getPublicKey().length - 4, keyPair.getPublicKey().length);
        Assert.assertArrayEquals(hint, last4BytesPublicKey);
    }

}