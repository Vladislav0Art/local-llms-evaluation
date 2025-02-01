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
public class GeneratedConstructionWithOnlyPublicKeyTest {

    @Test
    public void constructionWithOnlyPublicKeyTest() {
        EdDSAPublicKey pubkey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(pubkey);
        assertEquals(keyPair.getPublicKey(), pubkey.getAbyte());
    }

}