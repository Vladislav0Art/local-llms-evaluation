package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCannotSignEmptySeedReturnsFalse {

    @Test
    public void cannotSignEmptySeedReturnsFalse() throws GeneralSecurityException, IOException {
        char[] seed = "";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertFalse(keyPair.canSign());
    }

}