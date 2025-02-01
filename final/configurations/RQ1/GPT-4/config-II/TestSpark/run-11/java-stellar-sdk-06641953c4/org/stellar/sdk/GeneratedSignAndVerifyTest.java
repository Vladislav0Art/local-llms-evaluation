package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.stellar.sdk.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSignAndVerifyTest {

    @Test
    public void signAndVerifyTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "test data";
        byte[] signature = keyPair.sign(data.getBytes());
        assertTrue(keyPair.verify(data.getBytes(), signature));
    }

}