package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

public class GeneratedKeyPairConstructorWithBothKeysTest {

    @Test
    public void KeyPairConstructorWithBothKeysTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[32]);
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey(new byte[64]);
        org.stellar.sdk.KeyPair keyPair = new org.stellar.sdk.KeyPair(publicKey, privateKey);

        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}