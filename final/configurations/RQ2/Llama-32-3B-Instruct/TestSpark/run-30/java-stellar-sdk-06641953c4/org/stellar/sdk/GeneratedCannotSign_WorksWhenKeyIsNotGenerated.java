package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCannotSign_WorksWhenKeyIsNotGenerated {

    @Test
    public void cannotSign_WorksWhenKeyIsNotGenerated() {
        assertNull(KeyPair.fromSecretSeed(new char[0]));
        assertTrue(KeyPair.fromSecretSeed(new byte[0]).canSign());
    }

}