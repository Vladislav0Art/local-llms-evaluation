package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

public class GeneratedSignWithoutPrivateKeyTest {

    @Test
    public void signWithoutPrivateKeyTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[32]);
        org.stellar.sdk.KeyPair keyPair = new org.stellar.sdk.KeyPair(publicKey);

        byte[] data = new byte[0];
        keyPair.sign(data);
    }

}