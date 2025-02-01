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
public class GeneratedFromPublicKeyInvalidArgumentTest {

    @Test
    public void fromPublicKeyInvalidArgumentTest() {
        byte[] invalidPublicKey = new byte[0]; // An invalid public key which should be 32 bytes
        KeyPair.fromPublicKey(invalidPublicKey);
    }

}