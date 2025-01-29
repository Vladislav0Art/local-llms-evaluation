package org.stellar.sdk;

import org.junit.Test;

import java.security.PublicKey;
import java.security.Signature;

public class GeneratedTestGetByteArrayFromNull {

    @Test
    public void testGetByteArrayFromNull() {
        null byte[] data = new byte[0];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (InputStream in = new ByteArrayInputStream(data)) {
            bos.write(in.readAllBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public PublicKey generatePublicKey(String publicKeyStr) {
        return new PublicKey(publicKeyStr);
    }

    public byte[] generateByteArrayFromPublicKey(String publicKeyStr) {
        return generatePublicKey(publicKeyStr).getEncoded();
    }

}