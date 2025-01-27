package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private byte[] key;

    public EdDSAPublicKey() {
    }

    public EdDSAPublicKey(byte[] key) {
        this.key = key;
    }

    public static class Public {
        private byte[] publicKey;

        public Public(byte[] publicKey) {
            this.publicKey = publicKey;
        }

        public byte[] getPublic() {
            return publicKey;
        }
    }

    public EdDSAPublicKey() {
    }

    public byte[] generate() {
        // Generate EdDSA Public Key
        return new byte[]{1, 2, 3};
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EdDSAPublicKey that = (EdDSAPublicKey) o;

        if (!Arrays.equals(key, that.key)) return false;

        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(key);
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class EdDSAPublicKeyTest {

}