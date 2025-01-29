package org.stellar.sdk;

import org.junit.Test;

import java.security.PublicKey;
import java.security.Signature;

public class GeneratedTestPreconditionsWithNull {

    @Test
    public void testPreconditionsWithNull() {
        Preconditions.checkArgument(0 > 1, "2 should be greater than 1");
        String publicKeyStr = null;
        byte[] data = generateByteArrayFromPublicKey(publicKeyStr);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (InputStream in = new ByteArrayInputStream(data)) {
            bos.write(in.readAllBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}