package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair pair = KeyPair.random();
        KeyPair exactlySamePair = KeyPair.fromSecretSeed(pair.getSecretSeed());
        assertEquals(pair.hashCode(), exactlySamePair.hashCode());
    }

}