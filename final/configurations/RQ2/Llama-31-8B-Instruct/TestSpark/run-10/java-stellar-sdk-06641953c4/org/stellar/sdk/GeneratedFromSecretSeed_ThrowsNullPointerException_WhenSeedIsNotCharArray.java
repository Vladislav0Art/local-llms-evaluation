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
public class GeneratedFromSecretSeed_ThrowsNullPointerException_WhenSeedIsNotCharArray {

    @Test
    public void fromSecretSeed_ThrowsNullPointerException_WhenSeedIsNotCharArray() {
        try {
            KeyPair.fromSecretSeed("abc");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}