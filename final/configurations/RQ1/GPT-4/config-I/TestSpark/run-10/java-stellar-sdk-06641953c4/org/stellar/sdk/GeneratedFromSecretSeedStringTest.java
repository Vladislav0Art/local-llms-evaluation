package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.Utils;
import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.StrKey;

import java.security.spec.InvalidKeySpecException;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SD2FDUUOJZ4DPOHS267656DR7RHNAR2327EFMDZYHAPUTCOPUBLVUVSJ";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}