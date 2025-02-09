package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedCanSignTrueTest {

    @Test
    public void canSignTrueTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

}