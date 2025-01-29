package org.stellar.sdk;

import org.junit.Test;

import java.security.PublicKey;
import java.security.Signature;

public class GeneratedTestGetByteArrayFromZeroLength {

    @Test
    public void testGetByteArrayFromZeroLength() {
        byte[] data = new byte[0];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (InputStream in = new ByteArrayInputStream(data)) {
            bos.write(in.readAllBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}