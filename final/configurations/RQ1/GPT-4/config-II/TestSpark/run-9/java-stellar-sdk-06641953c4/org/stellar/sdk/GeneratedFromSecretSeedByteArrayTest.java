package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new byte[]{1, 0, 1, 0});
        assertNotNull(keyPair);
    }

}