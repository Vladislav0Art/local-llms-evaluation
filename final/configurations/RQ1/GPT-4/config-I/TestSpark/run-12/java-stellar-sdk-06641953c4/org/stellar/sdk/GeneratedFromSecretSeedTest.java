package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import org.mockito.Mockito;

import java.security.GeneralSecurityException;

public class GeneratedFromSecretSeedTest {

    @Test
    public void fromSecretSeedTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        assertNotNull(pair);
    }

}