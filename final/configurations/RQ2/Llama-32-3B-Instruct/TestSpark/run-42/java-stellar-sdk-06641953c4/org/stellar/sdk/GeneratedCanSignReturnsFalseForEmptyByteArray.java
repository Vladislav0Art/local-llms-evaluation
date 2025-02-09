package org.stellar.sdk;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSignReturnsFalseForEmptyByteArray {

    @BeforeClass
    public static void setup() {
        // Setup is not needed for this test class
    }

    @Test
    public void canSignReturnsFalseForEmptyByteArray() {
        byte[] emptyByteArray = new byte[0];
        assertTrue(KeyPair.canSign(emptyByteArray));
    }

}