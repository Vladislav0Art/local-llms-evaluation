package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.Uint256;

import java.io.IOException;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedKeyPairValidInputTest {

    @Test
    public void KeyPairValidInputTest() {
        byte[] validPublicKey = {2, 4, 6, 8, 10, 12};
        EdDSAPublicKeySpec spec = new EdDSAPublicKeySpec(validPublicKey, EdDSANamedCurveTable.ED_25519_CURVE_SPEC);
        EdDSAPublicKey validEdDSAPublicKey = new EdDSAPublicKey(spec);
        KeyPair keyPair = new KeyPair(validEdDSAPublicKey);
        assertTrue(keyPair != null);
    }

}