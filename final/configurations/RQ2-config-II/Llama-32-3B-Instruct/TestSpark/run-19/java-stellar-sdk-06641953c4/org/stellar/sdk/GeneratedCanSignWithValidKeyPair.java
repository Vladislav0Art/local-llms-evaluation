package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCanSignWithValidKeyPair {

    @Test
    public void canSignWithValidKeyPair() {
        EdDSAPublicKey publicKey = EdDSAPrivateKey.generate().getPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}