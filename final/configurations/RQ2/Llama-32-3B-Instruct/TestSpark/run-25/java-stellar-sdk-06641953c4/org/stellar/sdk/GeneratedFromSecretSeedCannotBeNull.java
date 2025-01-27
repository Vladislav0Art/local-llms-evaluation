package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeedCannotBeNull {

    @Test
    public void fromSecretSeedCannotBeNull() {
        assertThrows(NullPointerException.class, () -> KeyPair.fromSecretSeed(null));
    }

}