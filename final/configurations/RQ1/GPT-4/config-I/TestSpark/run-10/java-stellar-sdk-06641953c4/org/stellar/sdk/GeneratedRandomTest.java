package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.Utils;
import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.StrKey;

import java.security.spec.InvalidKeySpecException;

import static org.junit.Assert.*;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}