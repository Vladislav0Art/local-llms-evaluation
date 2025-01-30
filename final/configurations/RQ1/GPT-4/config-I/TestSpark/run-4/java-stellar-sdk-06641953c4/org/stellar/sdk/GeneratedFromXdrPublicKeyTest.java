package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;

public class GeneratedFromXdrPublicKeyTest {

    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName("SHA-512");

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey xdrPublicKey = new PublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);
        assertNotNull(keyPair);
    }

}