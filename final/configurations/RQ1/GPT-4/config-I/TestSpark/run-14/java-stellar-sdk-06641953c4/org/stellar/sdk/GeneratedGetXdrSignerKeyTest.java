package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.spec.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetXdrSignerKeyTest {

    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey xdrSignerKey = keyPair.getXdrSignerKey();
        assertNotNull(xdrSignerKey);
        assertNotNull(xdrSignerKey.getDiscriminant());
        assertNotNull(xdrSignerKey.getEd25519());
    }

}