package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNullFromXdr {

    @Test
    public void testNullFromXdr() {
        NullPublicKeyFromXdr nullPublicKeyFromXdr = KeyPair.fromXdrPublicKey(null);
        assertEquals(null, nullPublicKeyFromXdr.publicKeyBytes);
    }
}

class PublicKey {
    public byte[] publicKeyBytes;

    public PublicKey(byte[] bytes) {
        this.publicKeyBytes = bytes;
    }

    public byte[] fromXdrPublicKey() {
        return new byte[]{publicKeyBytes[0], publicKeyBytes[1]};
    }
}

class NullPublicKeyFromXdr extends KeyPair {
    @Override
    public PublicKey fromXdrPublicKey(byte[] xdrPublicKey) {
        return new NullPublicKeyFromXdr();
    }

    private static class NullPublicKeyFromXdr implements PublicKey {
        @Override
        public byte[] fromXdrPublicKey() {
            throw new UnsupportedOperationException("Method not implemented.");
        }
    }
}

class EdDSAPublicKey {
    public byte[] publicKeyBytes;

    public EdDSAPublicKey(byte[] bytes) {
        this.publicKeyBytes = bytes;
    }

    public byte[] getPublicKey() {
        return publicKeyBytes;
    }

    @Override
    public String toString() {
        return "EdDSAPublicKey{" +
                "publicKeyBytes=" + Arrays.toString(publicKeyBytes) +
                '}';
    }
}

class EdDSAPrivateKey {
    private byte[] privateKeyBytes;

    public EdDSAPrivateKey(byte[] bytes) {
        this.privateKeyBytes = bytes;
    }

    public byte[] getPrivateKey() {
        return privateKeyBytes;
    }

}