package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.nio.charset.StandardCharsets;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertNotNull(keyPair.getPublicKey());
    }

}