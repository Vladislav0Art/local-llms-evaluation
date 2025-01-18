package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetKeyPairFromXdrSignerKeyTest {

    @Test
    public void getKeyPairFromXdrSignerKeyTest() {
        SignerKey signerKey = new SignerKey();
        Assert.assertNotNull(KeyPair.fromXdrSignerKey(signerKey));
    }

}