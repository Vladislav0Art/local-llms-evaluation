package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        PublicKey key = pair.getXdrPublicKey();
        assertNotNull(key);
    }

}