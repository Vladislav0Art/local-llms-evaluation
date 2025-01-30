package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;

public class GeneratedFromSecretSeedStringInsecureTest {

    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName("SHA-512");

    @Test
    public void fromSecretSeedStringInsecureTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SACJC372QBSSKJZZHBL54BR4G4WLC2VJJ5YPBSOND4POT7CFP2E5UOGO");
        assertNotNull(keyPair);
    }

}