package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        KeyPair pair = KeyPair.random();
        String data = "hello world";
        byte[] bytes = pair.sign(data.getBytes());
        assertTrue(pair.verify(data.getBytes(), bytes));
    }

}