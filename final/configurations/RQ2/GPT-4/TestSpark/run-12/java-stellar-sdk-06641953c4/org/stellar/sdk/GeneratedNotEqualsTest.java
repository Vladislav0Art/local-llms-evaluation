package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedNotEqualsTest {

    @Test
    public void notEqualsTest() {
        EdDSAPublicKey publicKey1 = Mockito.mock(EdDSAPublicKey.class, "publicKey1");
        EdDSAPublicKey publicKey2 = Mockito.mock(EdDSAPublicKey.class, "publicKey2");
        KeyPair keyPair1 = new KeyPair(publicKey1);
        KeyPair keyPair2 = new KeyPair(publicKey2);
        Assert.assertFalse(keyPair1.equals(keyPair2));
    }

}