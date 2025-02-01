package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        KeyPair keyPair = new KeyPair(edDSAPublicKey);
        keyPair.sign(new byte[]{0, 1, 0, 1});
    }

}