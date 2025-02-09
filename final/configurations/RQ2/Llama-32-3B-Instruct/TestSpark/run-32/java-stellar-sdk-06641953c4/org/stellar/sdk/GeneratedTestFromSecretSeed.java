package org.stellar.sdk;

import org.junit.Test;

import java.security.KeyPair;
import java.util.Arrays;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        byte[] seed = {0x01, 0x02, 0x03, 0x04};
        KeyPair keyPair = new FromSecretSeed().fromSecretSeed(seed);
    }

}