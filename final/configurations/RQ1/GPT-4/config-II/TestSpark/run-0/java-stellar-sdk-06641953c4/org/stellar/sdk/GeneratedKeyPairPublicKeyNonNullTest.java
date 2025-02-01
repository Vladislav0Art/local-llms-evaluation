package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedKeyPairPublicKeyNonNullTest {

    @Test
    public void KeyPairPublicKeyNonNullTest() {
        java.security.KeyPair keyPair = new KeyPairGenerator().generateKeyPair();
        KeyPair pairUnderTest = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), null);
        Assert.assertNotNull(pairUnderTest);
    }

}