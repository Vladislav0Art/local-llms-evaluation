package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGenerate_WithIncorrectSeedTest {

    @Test
    public void generate_WithIncorrectSeedTest() {
        byte[] seed = new byte[0];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotEquals(0, keyPair.hashCode());
    }
}

public class XdrPublicKeyTest {

    private final PublicKey xdrPublicKey;

    public XdrPublicKeyTest(PublicKey xdrPublicKey) {
        this.xdrPublicKey = checkNotNull(xdrPublicKey);
    }

}