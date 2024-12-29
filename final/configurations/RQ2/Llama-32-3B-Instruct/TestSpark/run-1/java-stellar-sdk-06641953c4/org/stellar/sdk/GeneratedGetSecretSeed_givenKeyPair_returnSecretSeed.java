package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetSecretSeed_givenKeyPair_returnSecretSeed {

    @Test
    public void getSecretSeed_givenKeyPair_returnSecretSeed() {
        char[] seed = "1234".toCharArray();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        assertEquals(seed, keyPair.getSecretSeed());
    }

}