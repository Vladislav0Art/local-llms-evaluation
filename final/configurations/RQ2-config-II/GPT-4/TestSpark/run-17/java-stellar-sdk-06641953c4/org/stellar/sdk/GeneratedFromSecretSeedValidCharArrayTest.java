package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedValidCharArrayTest {

    @Test
    public void fromSecretSeedValidCharArrayTest() {
        char[] seed = "SBUV3MRGVTBKP2I72AWYI2Z27YE2UBOAO4ZG5DJUKFCH3OG472U6WZ2F".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}