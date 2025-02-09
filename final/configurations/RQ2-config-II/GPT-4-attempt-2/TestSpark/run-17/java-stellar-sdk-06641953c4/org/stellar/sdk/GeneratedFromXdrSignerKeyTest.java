package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey mockSignerKey = Mockito.mock(SignerKey.class);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(mockSignerKey);
        Assert.assertNotNull(keyPair);
    }

}