package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(publicKey);
        Assert.assertTrue(keyPair1.equals(keyPair2));
    }

}