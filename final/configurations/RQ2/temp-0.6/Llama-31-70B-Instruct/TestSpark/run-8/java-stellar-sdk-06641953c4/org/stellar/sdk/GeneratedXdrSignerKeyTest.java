package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedXdrSignerKeyTest {

    @Test
    public void xdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed");
        assertEquals(keyPair.getXdrSignerKey(), SignerKey.fromBytes(new byte[]{0, 1, 2, 3}));
    }

}