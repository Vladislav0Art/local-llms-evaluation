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
public class GeneratedHashcodeTest {

    @Test
    public void hashcodeTest() {
        EdDSAPublicKey pubkey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privkey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair1 = new KeyPair(pubkey, privkey);
        KeyPair keyPair2 = new KeyPair(pubkey, privkey);
        assertEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}