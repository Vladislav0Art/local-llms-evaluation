package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedKeyPairPublicKeyPrivateKeyTest {

    @Test
    public void KeyPairPublicKeyPrivateKeyTest() {
        EdDSAPublicKey mockPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        EdDSAPrivateKey mockPrivateKey = new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        KeyPair keyPair = new KeyPair(mockPublicKey, mockPrivateKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}