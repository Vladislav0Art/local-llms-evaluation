package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.i2p.crypto.eddsa.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKey;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_ReturnsKeyPair_WhenSeedIsProvided {

    @Test
    public void fromSecretSeed_ReturnsKeyPair_WhenSeedIsProvided() {
        char[] seed = new char[]{'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}