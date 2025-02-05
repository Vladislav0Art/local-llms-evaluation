package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        assertNotNull(KeyPair.fromSecretSeed("SAZSYMJQBB6L3OJXQA4M2YQJTWSZ5CFSLV4PAUCJAFSFRENFTP4U3G4Z"));
    }

}