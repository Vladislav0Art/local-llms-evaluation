package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetPublicKey WorksWhenKeyIsGenerated {

    @Test
    public void getPublicKey

    WorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

}