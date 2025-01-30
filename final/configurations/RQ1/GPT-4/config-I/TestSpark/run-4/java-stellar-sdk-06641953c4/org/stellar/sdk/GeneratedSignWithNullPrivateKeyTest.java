package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;

public class GeneratedSignWithNullPrivateKeyTest {

    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName("SHA-512");

    @Test
    public void signWithNullPrivateKeyTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(pubKeySpec), null);
        keyPair.sign(new byte[32]);
    }

}