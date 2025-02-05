package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedNullByteArrayTest {

    @Test
    public void fromSecretSeedNullByteArrayTest() {
        KeyPair.fromSecretSeed((byte[]) null);
    }

}