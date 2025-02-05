package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair pair1 = KeyPair.random();
        KeyPair pair2 = KeyPair.fromSecretSeed(pair1.getSecretSeed());

        assertTrue(pair1.equals(pair2));
    }

}