package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import org.mockito.Mockito;

import java.security.GeneralSecurityException;

public class GeneratedTest {

    @Test
    public void constructorPairWithPublicKeyAndPrivateKeyTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair pair = new KeyPair(publicKey, privateKey);
        assertNotNull(pair);
    }

    @Test
    public void fromSecretSeedTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        assertNotNull(pair);
    }

    @Test
    public void canSignTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair pair = new KeyPair(publicKey, privateKey);
        assertTrue(pair.canSign());
    }

    @Test
    public void getAccountIdTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        assertEquals("GA6DI7ZDULGQM7H36RZPMGXEZT4SESZ5Y6OHEYOJ353RJ3X26GK4S622", pair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        char[] secretSeed = pair.getSecretSeed();
        assertNotNull(secretSeed);
    }

    @Test
    public void signTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        String data = "example data";
        byte[] result = pair.sign(data.getBytes());
        assertNotNull(result);
    }

    @Test
    public void verifyTest() throws GeneralSecurityException {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        String data = "example data";
        byte[] signed = pair.sign(data.getBytes());
        assertTrue(pair.verify(data.getBytes(), signed));
    }

}