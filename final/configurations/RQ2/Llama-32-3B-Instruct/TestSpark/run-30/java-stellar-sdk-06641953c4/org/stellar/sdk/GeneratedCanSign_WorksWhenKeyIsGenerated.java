package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCanSign_WorksWhenKeyIsGenerated {

    @Test
    public void canSign_WorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

}