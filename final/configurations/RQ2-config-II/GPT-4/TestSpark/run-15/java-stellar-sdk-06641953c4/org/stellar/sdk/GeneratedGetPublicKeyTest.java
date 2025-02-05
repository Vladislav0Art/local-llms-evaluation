package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.getPublicKey());
    }

}