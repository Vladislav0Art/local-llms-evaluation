package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromBip39SeedNullTest {

    @Test
    public void fromBip39SeedNullTest() {
        KeyPair.fromBip39Seed(null, 1);
    }

}