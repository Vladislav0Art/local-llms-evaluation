package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.PublicKey;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

}