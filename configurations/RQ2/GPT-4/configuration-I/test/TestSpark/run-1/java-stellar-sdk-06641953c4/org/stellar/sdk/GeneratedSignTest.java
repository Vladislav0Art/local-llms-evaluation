package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.PublicKey;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3};
        assertNotNull(keyPair.sign(data));
    }

}