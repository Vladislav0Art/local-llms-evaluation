package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;

public class GeneratedCreateNewKeyPairFromSecretSeedCharArrayReturnsSameAsCharArray {

    @Test
    public void createNewKeyPairFromSecretSeedCharArrayReturnsSameAsCharArray() {
        char[] seed1 = new char[32];
        Arrays.fill(seed1, '0');
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed1);
        char[] seed2 = new char[32];
        Arrays.fill(seed2, '0');
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed2);
        assertEquals(Arrays.toString(seed1), Arrays.toString(keyPair2.getSecretSeed()));
    }

}