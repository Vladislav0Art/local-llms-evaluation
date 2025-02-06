package org.stellar.sdk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;

public class GeneratedEqualsEquals_ReturnsTrue_WhenBothObjectsAreSameInstance {

    private KeyPair keyPair;

    @Before
    public void setup() {
        EdDSAPublicKey publicKey = EdDSAPrivateKey.generate().getPublic();
        keyPair = new KeyPair(publicKey);
    }

    @Test
    public void equalsEquals_ReturnsTrue_WhenBothObjectsAreSameInstance() {
        KeyPair otherKeyPair = new KeyPair(keyPair.getPublic());
        assertTrue(keyPair.equals(otherKeyPair));
    }

}