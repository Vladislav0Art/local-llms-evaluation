package org.stellar.sdk;

import org.junit.Test;

import java.security.KeyPair;
import java.util.Arrays;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        EdDSSKeyPair keyPair = new EdDSSKeyPair();
        assertNotNull(keyPair.getPublicKey());
    }
}

class Fill {

    public void fill(byte[] seed) {
        Arrays.fill(seed, 'a');
    }
}

class FromSecretSeed implements KeyPair {

    @Override
    public byte[] getPublicKey() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public byte[] fromSecretSeed(byte[] seed) {
        return null;
    }
}

class FromAccountId implements KeyPair {

    @Override
    public byte[] getPublicKey() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public byte[] fromAccountId(String accountId) {
        return null;
    }
}

public class EdDSSKeyPair implements KeyPair {

    private String publicKey;

    public EdDSSKeyPair() {
        this.publicKey = "R5P7J2V9CQX3F2G2U3X5";
    }

    @Override
    public byte[] getPublicKey() {
        return publicKey.getBytes();
    }

}