package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.*;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedCharArrayLengthTest {

    @Test
    public void fromSecretSeedCharArrayLengthTest() {
        try {
            KeyPair.fromSecretSeed(new char[1]);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException iae) {
            assertEquals("IllegalArgumentException: Secret seed must be 56 characters long.", iae.getMessage());
        }
    }

}