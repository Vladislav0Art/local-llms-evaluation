package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedGetXdrSignerKeyTest {

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrSignerKey());
    }

}