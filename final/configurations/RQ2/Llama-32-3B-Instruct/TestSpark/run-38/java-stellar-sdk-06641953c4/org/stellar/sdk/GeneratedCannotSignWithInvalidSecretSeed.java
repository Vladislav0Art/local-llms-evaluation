package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCannotSignWithInvalidSecretSeed {

    @Test
    public void cannotSignWithInvalidSecretSeed() {
        char[] invalidSeed = createCharArray("invalidseed");
        KeyPair keyPair = KeyPair.fromSecretSeed(invalidSeed);
        assertFalse(keyPair.canSign());
    }

}