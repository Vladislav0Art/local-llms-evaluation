package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSign_InvalidInput_ReturnsNull {

    @Test
    public void sign_InvalidInput_ReturnsNull() throws GeneralSecurityException, IOException {
        KeyPair keyPair = new KeyPair(null);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdr = new XdrDataOutputStream(bos);
        keyPair.sign(new byte[16]);
        assertArrayEquals(new byte[0], bos.toByteArray());
    }

}