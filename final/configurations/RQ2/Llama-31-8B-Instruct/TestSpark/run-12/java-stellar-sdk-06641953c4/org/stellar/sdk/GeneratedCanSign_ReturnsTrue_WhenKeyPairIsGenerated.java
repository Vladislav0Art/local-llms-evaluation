package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSign_ReturnsTrue_WhenKeyPairIsGenerated {

    @Test
    public void canSign_ReturnsTrue_WhenKeyPairIsGenerated() {
        EdDSANamedCurveSpec curveSpec = new EdDSANamedCurveSpec("Ed25519");
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(new byte[]{1, 2, 3}, curveSpec);
        EdDSAPublicKey publicKey = new EdDSAPublicKey(publicKeySpec);
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}