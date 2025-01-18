package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedCanSignFalseTest {

    @Test
    public void canSignFalseTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new byte[32]);
        assertFalse(keyPair.canSign());
    }

}