package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedXdrPublicKeyTest {

    @Test
    public void xdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed");
        assertEquals(keyPair.getXdrPublicKey(), PublicKey.fromBytes(new byte[]{0, 1, 2, 3}));
    }

}