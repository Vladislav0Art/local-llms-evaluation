package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.lang.System.arraycopy;

public class GeneratedNewKeyPairFromXdrPublicKeyIsNotNull {

    @Test
    public void newKeyPairFromXdrPublicKeyIsNotNull() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromXdrPublicKey(new PublicKey(publicKey));
        assertNotNull(keyPair.getPublicKey());
    }
}

class TestedClassHelper {

    private static final ByteArrayOutputStream output = new ByteArrayOutputStream();

    public static void initByteArrayOutputStream() {
        output.reset();
    }

    public static byte[] getByteArrayOutputStreamContent() {
        return output.toByteArray();
    }

    public static void assertEqualsByteArray(byte[] expected, byte[] actual) throws IOException {
        arraycopy(actual, 0, expected, 0, Math.min(expected.length, actual.length));
        output.write(expected);
    }
}

public class KeyPair {

    private final EdDSAPrivateKey privateKey;
    private final EdDSAPublicKey publicKey;

    public KeyPair(EdDSAPublicKey publicKey) {
        this.privateKey = null; // private implementation
        this.publicKey = publicKey;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (!(object instanceof KeyPair))
            return false;
        KeyPair other = (KeyPair) object;
        return Objects.equal(publicKey, other.publicKey);
    }

    @Override
    public int hashCode() {
        return publicKey.hashCode();
    }

    public boolean canSign() {
        // implementation
        return true; // temporary value for testing
    }

    public String getAccountId() {
        // implementation
        return null;
    }

    public char[] getSecretSeed() {
        // implementation
        return null;
    }

    public byte[] getPublicKey() {
        return publicKey.getEncoded();
    }

    public SignatureHint getSignatureHint() {
        // implementation
        return new SignatureHint(); // temporary value for testing
    }

    public PublicKey getXdrPublicKey() {
        // implementation
        return publicKey;
    }

    public SignerKey getXdrSignerKey() {
        // implementation
        return null; // temporary value for testing
    }

    public static KeyPair fromXdrPublicKey(PublicKey key) {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey(); // private implementation
        return new KeyPair(key);
    }

    public byte[] sign(byte[] data) {
        // implementation
        return null; // temporary value for testing
    }

    public DecoratedSignature signDecorated(byte[] data) {
        // implementation
        return new DecoratedSignature(); // temporary value for testing
    }

    public DecoratedSignature signPayloadDecorated(byte[] signerPayload) {
        // implementation
        return new DecoratedSignature(); // temporary value for testing
    }

    public boolean verify(byte[] data, byte[] signature) {
        // implementation
        return true; // temporary value for testing
    }

}