package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCannotSignWithInvalidKeyPair {

    @Test
    public void cannotSignWithInvalidKeyPair() {
        EdDSAPublicKey publicKey = null;
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.canSign());
    }

}