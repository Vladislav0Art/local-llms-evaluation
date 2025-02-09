package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey mockSignerKey = mock(SignerKey.class);
        assertNotNull(KeyPair.fromXdrSignerKey(mockSignerKey));
    }

}