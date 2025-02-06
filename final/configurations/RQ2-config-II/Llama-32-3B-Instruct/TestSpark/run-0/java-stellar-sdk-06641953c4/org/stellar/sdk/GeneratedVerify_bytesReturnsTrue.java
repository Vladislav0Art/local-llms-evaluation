package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedVerify_bytesReturnsTrue {

    @Test
    public void verify_bytesReturnsTrue() throws IOException, GeneralSecurityException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream out = new XdrDataOutputStream(bos);
        Uint256 data = Uint256.valueOf(1L);
        Signature signature = Signature.getInstance("SHA256withED25519");
        signature.initSign(null);
        signature.update(data.getBytes());
        signature.sign(bos.toByteArray());
        bos.flush();
        byte[] signatureBytes = bos.toByteArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(signatureBytes);
        assertTrue(keyPair.verify(Uint256.valueOf(1L).getBytes(), signatureBytes));
    }

}