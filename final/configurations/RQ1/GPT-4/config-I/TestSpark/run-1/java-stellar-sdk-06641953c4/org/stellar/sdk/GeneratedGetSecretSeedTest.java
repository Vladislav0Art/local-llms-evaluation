package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetSecretSeedTest {

    @Test
    public void GetSecretSeedTest() {
        KeyPair actualKeyPair = KeyPair.fromSecretSeed("seed");
        char[] secretSeed = actualKeyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

}