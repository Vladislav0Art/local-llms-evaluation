package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedTestUsingCharArray {

    @Test
    public void fromSecretSeedTestUsingCharArray() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW".toCharArray());
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}