package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedNullStringTest {

    @Test
    public void fromSecretSeedNullStringTest() {
        KeyPair.fromSecretSeed((String) null);
    }

}