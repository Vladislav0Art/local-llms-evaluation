package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetSecretSeed WorksWhenKeyIsGenerated {

    @Test
    public void getSecretSeed

    WorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSecretSeed());
    }

}