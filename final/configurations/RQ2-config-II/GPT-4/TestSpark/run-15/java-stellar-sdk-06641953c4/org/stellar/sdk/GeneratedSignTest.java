package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair pair = KeyPair.random();
        String data = "hello world";
        byte[] bytes = pair.sign(data.getBytes());
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

}