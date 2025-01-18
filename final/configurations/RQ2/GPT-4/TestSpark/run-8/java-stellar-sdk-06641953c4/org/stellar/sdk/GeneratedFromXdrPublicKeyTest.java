package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey mockPublicKey = Mockito.mock(PublicKey.class);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(mockPublicKey);
        Assert.assertNotNull(keyPair);
    }

}