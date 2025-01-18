package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair pair1 = KeyPair.random();
        KeyPair pair2 = KeyPair.fromPublicKey(pair1.getPublicKey());
        assertTrue(pair1.equals(pair2));
    }

}