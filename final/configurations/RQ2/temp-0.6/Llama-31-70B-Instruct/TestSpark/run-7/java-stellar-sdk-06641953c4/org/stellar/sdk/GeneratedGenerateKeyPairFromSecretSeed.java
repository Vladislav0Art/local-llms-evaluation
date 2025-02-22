package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedGenerateKeyPairFromSecretSeed {

    @Test
    public void generateKeyPairFromSecretSeed() {
        String secretSeed = "SB2L7ECE3VZ5326JZUQW45VU3XQQJM72QZ4YK3YKCUBYSKIUPB742FU2";
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed.toCharArray());
        assertNotNull(keyPair);
    }

}