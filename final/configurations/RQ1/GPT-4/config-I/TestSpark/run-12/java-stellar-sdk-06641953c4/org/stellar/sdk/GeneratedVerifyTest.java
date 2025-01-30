package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import org.mockito.Mockito;

import java.security.GeneralSecurityException;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() throws GeneralSecurityException {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        String data = "example data";
        byte[] signed = pair.sign(data.getBytes());
        assertTrue(pair.verify(data.getBytes(), signed));
    }

}