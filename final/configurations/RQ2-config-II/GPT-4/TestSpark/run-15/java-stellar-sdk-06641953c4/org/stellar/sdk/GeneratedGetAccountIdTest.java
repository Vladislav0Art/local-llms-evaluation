package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.getAccountId());
    }

}