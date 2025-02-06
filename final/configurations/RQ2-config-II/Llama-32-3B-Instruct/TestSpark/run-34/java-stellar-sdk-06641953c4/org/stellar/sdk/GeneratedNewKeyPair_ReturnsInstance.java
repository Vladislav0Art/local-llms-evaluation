package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedNewKeyPair_ReturnsInstance {

    @Test
    public void newKeyPair_ReturnsInstance() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}