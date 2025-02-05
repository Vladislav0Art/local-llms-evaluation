package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.*;

import static org.junit.Assert.*;

public class GeneratedGetSecretSeedInvalidPrivateKeyTest {

    @Test
    public void getSecretSeedInvalidPrivateKeyTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.CURVE_ED25519_SHA512)));
        KeyPair keyPair = new KeyPair(publicKey);
        keyPair.getSecretSeed();
    }

}