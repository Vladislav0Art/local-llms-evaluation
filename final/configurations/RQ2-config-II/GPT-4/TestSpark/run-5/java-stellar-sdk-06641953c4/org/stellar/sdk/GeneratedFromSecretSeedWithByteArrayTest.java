package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedWithByteArrayTest {

    @Test
    public void fromSecretSeedWithByteArrayTest() {
        byte[] seed = new byte[]{1, 2, 3};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

}