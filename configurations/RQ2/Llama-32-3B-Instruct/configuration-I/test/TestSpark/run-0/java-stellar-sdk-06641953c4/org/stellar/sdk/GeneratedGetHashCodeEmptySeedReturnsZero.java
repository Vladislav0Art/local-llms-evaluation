package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedGetHashCodeEmptySeedReturnsZero {

    @Test
    public void getHashCodeEmptySeedReturnsZero() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertEquals(0, keyPair.hashCode());
    }

}