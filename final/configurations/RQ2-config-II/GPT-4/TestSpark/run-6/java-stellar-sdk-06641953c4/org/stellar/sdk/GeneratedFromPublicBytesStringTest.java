package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.nio.charset.StandardCharsets;

public class GeneratedFromPublicBytesStringTest {

    @Test
    public void fromPublicBytesStringTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[]{});
        Assert.assertNotNull(keyPair);
    }

}