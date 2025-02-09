package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey publicKeyMock = Mockito.mock(PublicKey.class);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKeyMock);
        assertNotEquals(null, keyPair);
    }

}