package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKeyMock = Mockito.mock(SignerKey.class);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKeyMock);
        assertNotEquals(null, keyPair);
    }

}