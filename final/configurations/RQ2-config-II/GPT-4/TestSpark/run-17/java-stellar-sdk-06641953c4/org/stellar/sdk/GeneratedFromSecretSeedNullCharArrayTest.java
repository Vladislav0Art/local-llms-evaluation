package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedNullCharArrayTest {

    @Test
    public void fromSecretSeedNullCharArrayTest() {
        KeyPair.fromSecretSeed((char[]) null);
    }

}