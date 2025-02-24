package org.stellar.sdk;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.security.GeneralSecurityException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(new PublicKey(), keyPair.getXdrPublicKey());
    }

}