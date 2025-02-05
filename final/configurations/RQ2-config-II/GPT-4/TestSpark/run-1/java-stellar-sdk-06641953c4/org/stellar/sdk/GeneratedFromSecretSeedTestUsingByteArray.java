package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedTestUsingByteArray {

    @Test
    public void fromSecretSeedTestUsingByteArray() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW".getBytes());
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}