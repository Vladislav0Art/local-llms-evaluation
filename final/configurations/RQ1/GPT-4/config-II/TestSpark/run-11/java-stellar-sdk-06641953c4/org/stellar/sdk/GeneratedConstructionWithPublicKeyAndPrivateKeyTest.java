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
public class GeneratedConstructionWithPublicKeyAndPrivateKeyTest {

    @Test
    public void constructionWithPublicKeyAndPrivateKeyTest() {
        EdDSAPublicKey pubkey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(pubkey, privKey);
        assertEquals(pubkey, keyPair.getPublicKey());
        assertTrue(keyPair.canSign());
    }

}