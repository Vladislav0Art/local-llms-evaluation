package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCanSignEmptySeedShouldReturnFalse {

    @Test
    public void canSignEmptySeedShouldReturnFalse() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertFalse(keyPair.canSign());
    }

}