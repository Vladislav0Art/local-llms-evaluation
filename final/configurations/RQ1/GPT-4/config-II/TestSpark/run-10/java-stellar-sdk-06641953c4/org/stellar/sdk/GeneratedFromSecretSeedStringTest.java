package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String secretSeed = "SACJVLYXMINMONYWMRIUROITLNDUSSPTPCIIYFVNYVKOJUZTEFZSYBLE35BXMUXF";
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        Assert.assertNotNull(keyPair);
    }

}