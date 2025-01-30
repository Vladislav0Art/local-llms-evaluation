package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        java.security.KeyPair rawKeyPair = new KeyPairGenerator().generateKeyPair();
        KeyPair keyPair = new KeyPair((EdDSAPublicKey) rawKeyPair.getPublic());
        KeyPair sameKeyPair = new KeyPair((EdDSAPublicKey) rawKeyPair.getPublic());
        KeyPair diffKeyPair = KeyPair.random();

        Assert.assertEquals(keyPair, sameKeyPair);
        Assert.assertNotEquals(keyPair, diffKeyPair);
    }

}