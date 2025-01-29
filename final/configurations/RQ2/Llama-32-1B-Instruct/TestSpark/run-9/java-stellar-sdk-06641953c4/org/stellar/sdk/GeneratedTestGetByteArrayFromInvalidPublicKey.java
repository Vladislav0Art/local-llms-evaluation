package org.stellar.sdk;

import org.junit.Test;

import java.security.PublicKey;
import java.security.Signature;

public class GeneratedTestGetByteArrayFromInvalidPublicKey {

    @Test
    public void testGetByteArrayFromInvalidPublicKey() {
        PublicKey publicKey = new PublicKey("invalid-key");
        byte[] data = publicKey.getEncoded();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (InputStream in = new ByteArrayInputStream(data)) {
            bos.write(in.readAllBytes());
        }
    }

}