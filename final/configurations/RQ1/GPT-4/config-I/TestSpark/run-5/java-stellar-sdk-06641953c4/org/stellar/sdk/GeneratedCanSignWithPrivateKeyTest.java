package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.security.MessageDigest;

public class GeneratedCanSignWithPrivateKeyTest {

    @Test
    public void canSignWithPrivateKeyTest() {
        KeyPairGenerator generator = new KeyPairGenerator();
        java.security.KeyPair keyPairJava = generator.generateKeyPair();

        KeyPair keyPair = new KeyPair((EdDSAPublicKey) keyPairJava.getPublic(), (EdDSAPrivateKey) keyPairJava.getPrivate());
        Assert.assertTrue(keyPair.canSign());
    }

}