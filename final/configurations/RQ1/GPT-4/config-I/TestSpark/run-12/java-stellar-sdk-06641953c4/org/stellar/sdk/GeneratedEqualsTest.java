package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair pair1 = KeyPair.random();
        KeyPair pair2 = KeyPair.random();
        assertFalse(pair1.equals(pair2));
        assertTrue(pair1.equals(pair1));
        assertFalse(pair1.equals(null));
        assertFalse(pair1.equals(new Object()));
    }

}