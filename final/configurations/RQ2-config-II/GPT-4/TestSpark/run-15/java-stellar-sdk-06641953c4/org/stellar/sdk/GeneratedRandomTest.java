package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair kp = KeyPair.random();
        assertNotNull(kp);
    }

}