package org.stellar.sdk;

import org.junit.Test;

import java.security.PublicKey;
import java.security.Signature;

public class GeneratedTestGetByteArrayFromPublicKey {

    @Test
    public void testGetByteArrayFromPublicKey() {
        PublicKey publicKey = new PublicKey("public-key");
        byte[] data = publicKey.getEncoded();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (InputStream in = new ByteArrayInputStream(data)) {
            bos.write(in.readAllBytes());
            System.out.println(bos.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}