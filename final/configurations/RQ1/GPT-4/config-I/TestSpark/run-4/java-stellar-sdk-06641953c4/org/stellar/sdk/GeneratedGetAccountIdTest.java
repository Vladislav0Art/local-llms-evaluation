package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;

public class GeneratedGetAccountIdTest {

    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName("SHA-512");

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("GAHWJSNVQYF4HZPEIOGAUBYVQ2YPBXBPTHMO3P7TOWRBFJLZKHJVPCJH");
        assertEquals(keyPair.getAccountId(), "GAHWJSNVQYF4HZPEIOGAUBYVQ2YPBXBPTHMO3P7TOWRBFJLZKHJVPCJH");
    }

}