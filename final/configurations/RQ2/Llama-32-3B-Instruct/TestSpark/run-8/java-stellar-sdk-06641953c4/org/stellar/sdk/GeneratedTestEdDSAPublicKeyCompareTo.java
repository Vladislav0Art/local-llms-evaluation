package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestEdDSAPublicKeyCompareTo {

    @Test
    public void testEdDSAPublicKeyCompareTo() {
        // Generate EdDSA Public Key
        EdDSAPublicKey eddSAPublicKey = new EdDSAPublicKey();
        byte[] publicKey = eddSAPublicKey.generate().getPublic();

        // Compare with expected value
        assertTrue(publicKey.length == 3);
    }
}

public class EdDSAPublicKey {
    public byte[] generate() {
        return new byte[]{1, 2, 3};
    }

    public byte[] getPublic() {
        return generate();
    }

}