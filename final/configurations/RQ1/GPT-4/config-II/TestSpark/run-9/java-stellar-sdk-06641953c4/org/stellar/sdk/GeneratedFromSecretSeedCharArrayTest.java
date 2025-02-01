package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'s', 'e', 'e', 'd'});
        assertNotNull(keyPair);
    }

}