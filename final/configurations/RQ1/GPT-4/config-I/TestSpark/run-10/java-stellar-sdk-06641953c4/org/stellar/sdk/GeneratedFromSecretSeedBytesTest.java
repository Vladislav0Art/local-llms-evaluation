package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.Utils;
import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.StrKey;

import java.security.spec.InvalidKeySpecException;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedBytesTest {

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] secret = {83, -9, -99, -34, -92, 85, 8, 45, -84, -95, 36, -40, -42, 21, -24, -75, -20, 73, -58, -45, -16, 33, -113, -85, 114, -78, 74, 19, -48, 95, -41, 8};
        KeyPair keyPair = KeyPair.fromSecretSeed(secret);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}