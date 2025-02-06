package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedVerify_InvalidInput_ReturnsFalse {

    @Test
    public void verify_InvalidInput_ReturnsFalse() throws GeneralSecurityException, IOException {
        KeyPair keyPair = new KeyPair(null);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdr = new XdrDataOutputStream(bos);
        byte[] signature = new byte[16];
        assertFalse(keyPair.verify(new byte[16], signature));
    }

}