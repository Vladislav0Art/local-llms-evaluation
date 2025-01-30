package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.random();

        assertEquals(32, keyPair.getPublicKey().length);
    }

}