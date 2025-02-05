package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedCharSequenceTest {

    @Test
    public void fromSecretSeedCharSequenceTest() {
        assertNotNull(KeyPair.fromSecretSeed("SAZSYMJQBB6L3OJXQA4M2YQJTWSZ5CFSLV4PAUCJAFSFRENFTP4U3G4Z"));
    }

}