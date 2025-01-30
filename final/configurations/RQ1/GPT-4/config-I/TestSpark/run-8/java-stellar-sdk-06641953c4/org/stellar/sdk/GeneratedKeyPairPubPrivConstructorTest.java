package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;

public class GeneratedKeyPairPubPrivConstructorTest {

    @Test
    public void keyPairPubPrivConstructorTest() {
        KeyPairGenerator keyPairGenerator = new KeyPairGenerator();
        java.security.KeyPair rawKeyPair = keyPairGenerator.generateKeyPair();
        KeyPair keyPair = new KeyPair((EdDSAPublicKey) rawKeyPair.getPublic(),
                (EdDSAPrivateKey) rawKeyPair.getPrivate());

        Assert.assertTrue(keyPair.canSign());
    }

}