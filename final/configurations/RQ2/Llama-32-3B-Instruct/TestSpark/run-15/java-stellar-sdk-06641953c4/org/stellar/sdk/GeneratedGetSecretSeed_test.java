package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;

public class GeneratedGetSecretSeed_test {

    @Test
    public void getSecretSeed_test() {
        KeyPair keyPair = new KeyPair();
        assertArrayEquals(new char[0], keyPair.getSecretSeed());
    }

}