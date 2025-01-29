package org.stellar.sdk;

import org.junit.Test;

import java.util.Arrays;

public class GeneratedTestEdDSAPublic {

    public static void main(String[] args) {
        new Test().run();
    }

    @Test
    public void testEdDSAPublic() {
        String publicKey = System.getProperty("eddsa.public", "123456");
        if (publicKey.isEmpty()) {
            throw new RuntimeException("Error: eddsa.public property is not set.");
        }
        // Use the public key to verify signatures
    }

}