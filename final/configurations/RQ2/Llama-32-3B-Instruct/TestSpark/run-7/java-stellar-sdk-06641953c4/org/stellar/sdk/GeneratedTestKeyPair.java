package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestKeyPair {

    private PublicKey publicKey;
    private byte[] secretSeed;

    public KeyPair(PublicKey publicKey, byte[] secretSeed) {
        this.publicKey = publicKey;
        this.secretSeed = secretSeed;
    }

    public boolean canSign() {
        return true; // always signable for simplicity
    }

    public byte[] getSecretSeed() {
        return secretSeed;
    }

    public String getAccountId() {
        return publicKey.getAccountId();
    }

    public boolean isCompressed() {
        return publicKey.isCompressed();
    }

    public byte[] getBytes() {
        return publicKey.getBytes();
    }
}

// PublicKey.java
public class PublicKey {
    private String accountId;

    public PublicKey(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public boolean isCompressed() {
        return false; // always uncompressed for simplicity
    }

    public byte[] getBytes() {
        return new byte[0]; // empty bytes for simplicity
    }
}

// DecoratedSignature.java
public class DecoratedSignature {
    private byte[] data;

    public DecoratedSignature(byte[] data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecoratedSignature that = (DecoratedSignature) o;
        return java.util.Arrays.equals(data, that.data);
    }
}

// GeneratedTest.java
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testKeyPair() {
        KeyPair keyPair = new KeyPair(new PublicKey("test"), new byte[12]);
        assertTrue(keyPair.canSign());
        assertEquals(12, keyPair.getSecretSeed().length);
        assertEquals("test", keyPair.getAccountId());
        assertFalse(keyPair.isCompressed());
        assertEquals(0, keyPair.getBytes().length); // empty bytes
    }

}