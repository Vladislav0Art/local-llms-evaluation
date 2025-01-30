package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import org.mockito.Mockito;

import java.security.GeneralSecurityException;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SDRHV2ZXBIIJ6GFYRMKY3QTOVSEQYM7CEHJOQM273ALMGUKMKOIRPJDV");
        assertEquals("GA6DI7ZDULGQM7H36RZPMGXEZT4SESZ5Y6OHEYOJ353RJ3X26GK4S622", pair.getAccountId());
    }

}