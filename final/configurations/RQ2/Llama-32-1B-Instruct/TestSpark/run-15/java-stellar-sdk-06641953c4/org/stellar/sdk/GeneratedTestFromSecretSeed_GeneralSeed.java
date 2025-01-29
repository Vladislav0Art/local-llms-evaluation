package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromSecretSeed_GeneralSeed {

    @Test
    public void testFromSecretSeed_GeneralSeed() {
        char[] generalSeed = "general_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(generalSeed);
        assertNotNull(keyPair.getSecretSeed());
        assertNotNull(keyPair.getPublicKey());
    }

}