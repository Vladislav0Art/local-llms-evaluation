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
public class GeneratedGetXdrSignerKeyTest {

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();

        assertNotNull(signerKey);
        assertNotNull(signerKey.getEd25519());
    }

}