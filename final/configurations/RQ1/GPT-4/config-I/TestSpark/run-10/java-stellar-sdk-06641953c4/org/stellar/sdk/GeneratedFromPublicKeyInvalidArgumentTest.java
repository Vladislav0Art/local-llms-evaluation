package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.EdDSANamedCurveSpec;
import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.StrKey;
import org.stellar.sdk.xdr.PublicKey;

import java.security.spec.InvalidKeySpecException;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyInvalidArgumentTest {

    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
    private static final EdDSAPublicKey mPublicKey = new EdDSAPublicKey(new EdDSAPrivateKeySpec(new byte[32], ed25519));
    private static final EdDSAPrivateKey mPrivateKey = new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], ed25519));

    @Test
    public void fromPublicKeyInvalidArgumentTest() {
        byte[] bytes = new byte[31];
        KeyPair keyPair = KeyPair.fromPublicKey(bytes);
    }

}