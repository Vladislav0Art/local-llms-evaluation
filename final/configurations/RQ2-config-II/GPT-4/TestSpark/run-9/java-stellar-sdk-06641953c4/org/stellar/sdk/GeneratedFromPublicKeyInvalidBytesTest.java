package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.*;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyInvalidBytesTest {

    @Test
    public void fromPublicKeyInvalidBytesTest() {
        try {
            KeyPair.fromPublicKey(new byte[1]);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException iep) {
            assertEquals("Invalid publicKey bytes", iep.getMessage());
        }
    }

}