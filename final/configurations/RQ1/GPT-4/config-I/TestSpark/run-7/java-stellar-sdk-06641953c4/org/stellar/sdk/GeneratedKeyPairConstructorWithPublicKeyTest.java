package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

public class GeneratedKeyPairConstructorWithPublicKeyTest {

    @Test
    public void KeyPairConstructorWithPublicKeyTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[32]);
        org.stellar.sdk.KeyPair keyPair = new org.stellar.sdk.KeyPair(publicKey);

        assertNotNull(keyPair);
        assertFalse(keyPair.canSign());
    }

}