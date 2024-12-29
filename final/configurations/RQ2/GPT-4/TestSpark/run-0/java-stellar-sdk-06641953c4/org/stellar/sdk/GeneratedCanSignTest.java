package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertFalse(keyPair.canSign());
    }

}