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

public class GeneratedFromXdrPublicKey_ReturnsValidKeyPair_WithCorrectPublicKey {

    private KeyPair keyPair;

    @Before
    public void setup() {
        EdDSAPublicKey publicKey = EdDSAPrivateKey.generate().getPublic();
        keyPair = new KeyPair(publicKey);
    }

    @Test
    public void fromXdrPublicKey_ReturnsValidKeyPair_WithCorrectPublicKey() throws IOException, GeneralSecurityException {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromXdrPublicKey(new PublicKey(publicKey));
        assertNotNull(keyPair.getPublicKey());
    }

}