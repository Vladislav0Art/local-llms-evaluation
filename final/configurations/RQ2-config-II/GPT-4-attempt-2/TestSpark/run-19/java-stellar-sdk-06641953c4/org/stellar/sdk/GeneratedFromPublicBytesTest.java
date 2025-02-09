package org.stellar.sdk;

import com.google.common.base.Charsets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromPublicBytesTest {

    @Test
    public void fromPublicBytesTest() {
        KeyPair oldPair = KeyPair.random();
        byte[] publicKey = oldPair.getPublicKey();
        KeyPair newPair = KeyPair.fromPublicKey(publicKey);

        assertEquals(oldPair.getPublicKey(), newPair.getPublicKey());
    }

}