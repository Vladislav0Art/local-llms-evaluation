package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedGetPublicKeyEmptySeedShouldReturnNull {

    @Test
    public void getPublicKeyEmptySeedShouldReturnNull() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertNull(keyPair.getPublicKey());
    }

}