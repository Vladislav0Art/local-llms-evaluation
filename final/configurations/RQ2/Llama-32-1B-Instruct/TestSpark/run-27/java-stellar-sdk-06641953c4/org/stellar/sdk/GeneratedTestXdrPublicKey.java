package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.XdrDataOutputStream;
import org.stellar.sdk.XdrDataInputStream;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() throws Exception {
        byte[] publicKey = KeyPair.fromPublicKey(new XdrDataOutputStream(new ByteArrayOutputStream()));
        assertEquals(publicKey.length, 32);
        assertNotNull(publicKey);
    }

}