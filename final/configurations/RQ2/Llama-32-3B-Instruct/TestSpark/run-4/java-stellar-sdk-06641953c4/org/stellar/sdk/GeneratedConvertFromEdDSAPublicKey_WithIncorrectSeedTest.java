package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertFromEdDSAPublicKey_WithIncorrectSeedTest {

    @Test
    public void convertFromEdDSAPublicKey_WithIncorrectSeedTest() {
        byte[] seed = new byte[0];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotEquals(0, keyPair.hashCode());
    }
}

public class XdrSignerKeyTest {

    private final SignerKey xdrSignerKey;

    public XdrSignerKeyTest(SignerKey xdrSignerKey) {
        this.xdrSignerKey = checkNotNull(xdrSignerKey);
    }

}