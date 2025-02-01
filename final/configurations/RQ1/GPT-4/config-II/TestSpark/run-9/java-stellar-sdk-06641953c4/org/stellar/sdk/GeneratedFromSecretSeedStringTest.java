package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("seed");
        assertNotNull(keyPair);
    }

}