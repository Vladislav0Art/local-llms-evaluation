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
public class GeneratedCanSign_ReturnsFalse_WhenKeyPairIsNotGenerated {

    @Test
    public void canSign_ReturnsFalse_WhenKeyPairIsNotGenerated() {
        KeyPair keyPair = null;
        assertFalse(keyPair.canSign());
    }

}