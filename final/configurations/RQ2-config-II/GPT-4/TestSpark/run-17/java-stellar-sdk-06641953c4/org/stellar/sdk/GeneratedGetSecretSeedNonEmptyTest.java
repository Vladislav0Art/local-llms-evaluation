package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedGetSecretSeedNonEmptyTest {

    @Test
    public void getSecretSeedNonEmptyTest() {
        char[] secret = KeyPair.random().getSecretSeed();
        assertNotNull(secret);
    }

}