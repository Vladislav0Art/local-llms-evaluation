package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedRandom {

    @Test
    public void random() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}