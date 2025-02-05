package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.nio.charset.StandardCharsets;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertNotNull(keyPair.getAccountId());
    }

}