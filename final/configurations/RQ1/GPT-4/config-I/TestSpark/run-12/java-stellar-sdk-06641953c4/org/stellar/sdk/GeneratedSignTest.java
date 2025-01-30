package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import org.mockito.Mockito;

import java.security.GeneralSecurityException;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        String data = "example data";
        byte[] result = pair.sign(data.getBytes());
        assertNotNull(result);
    }

}