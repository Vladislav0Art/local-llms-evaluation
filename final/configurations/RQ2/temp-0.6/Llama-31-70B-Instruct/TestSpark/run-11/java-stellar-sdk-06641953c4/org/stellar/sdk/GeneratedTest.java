package org.stellar.sdk;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.security.GeneralSecurityException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(false, keyPair.canSign());
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals("", keyPair.getAccountId());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        assertArrayEquals(new byte[0], keyPair.getPublicKey());
    }

    @Test
    public void signTest() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPair(null);
        keyPair.sign(new byte[0]);
    }

    @Test
    public void signPayloadDecoratedTest() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPair(null);
        keyPair.signPayloadDecorated(new byte[0]);
    }

}