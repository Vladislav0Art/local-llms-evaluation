package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.i2p.crypto.eddsa.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSign_ReturnsTrue_WhenKeyPairIsGenerated {

    @Test
    public void canSign_ReturnsTrue_WhenKeyPairIsGenerated() {
        EdDSANamedCurveSpec curveSpec = EdDSANamedCurveTable.getByName("Ed25519");
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(new byte[]{1, 2, 3}, curveSpec);
        EdDSAPublicKey publicKey = new EdDSAPublicKey(publicKeySpec);
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}