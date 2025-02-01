package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] secretSeed = "SACJVLYXMINMONYWMRIUROITLNDUSSPTPCIIYFVNYVKOJUZTEFZSYBLE35BXMUXF".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        Assert.assertNotNull(keyPair);
    }

}