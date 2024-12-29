package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_givenByteArray_returnSameInstance {

    @Test
    public void fromSecretSeed_givenByteArray_returnSameInstance() {
        byte[] seed = "1234".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.equals(keyPair));
    }

}