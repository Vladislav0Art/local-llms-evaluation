package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedCanSignNullOrEmptyTest {

    @Test
    public void canSignNullOrEmptyTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new byte[0]);
        assertFalse(keyPair.canSign());
    }

}