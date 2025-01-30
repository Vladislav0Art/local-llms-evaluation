package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.StrKey;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;

public class GeneratedKeyPairPubConstructorTest {

    @Test
    public void keyPairPubConstructorTest() {
        KeyPair randomKeyPair = KeyPair.random();
        KeyPair keyPair = new KeyPair(randomKeyPair.getPublicKey());
        Assert.assertFalse(keyPair.canSign());
    }

}