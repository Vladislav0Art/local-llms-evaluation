package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.XdrDataOutputStream;
import org.stellar.sdk.XdrDataInputStream;

public class GeneratedTestFromXdrSignature {

    @Test
    public void testFromXdrSignature() throws Exception {
        byte[] signatureBytes = XdrDataOutputStream.newInstance().putBoolean(true).finalize();
        KeyPair signerKey = KeyPair.fromXdr(signatureBytes);
        assertNotNull(signerKey.getPublic());
    }

}