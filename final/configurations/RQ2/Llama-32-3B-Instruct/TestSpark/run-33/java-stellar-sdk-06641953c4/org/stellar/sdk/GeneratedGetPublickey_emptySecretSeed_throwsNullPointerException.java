package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetPublickey_emptySecretSeed_throwsNullPointerException {

    @Test
    public void getPublickey_emptySecretSeed_throwsNullPointerException() {
        char[] seed = "";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertThrows(NullPointerException.class, () -> keyPair.getPublicKey());
    }
}

public class KeyPair {

    private final EdDSAPublicKey publicKey;

    public KeyPair(EdDSAPublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public boolean canSign() throws GeneralSecurityException {
        // implementation
    }

    public static KeyPair fromSecretSeed(char[] seed) throws GeneralSecurityException {
        // implementation
    }

    public static KeyPair fromSecretSeed(String seed) throws GeneralSecurityException {
        // implementation
    }

    public static KeyPair fromSecretSeed(byte[] seed) throws GeneralSecurityException {
        // implementation
    }

    public static KeyPair fromAccountId(String accountId) throws GeneralSecurityException {
        // implementation
    }

    public static KeyPair fromPublicKey(byte[] publicKey) throws GeneralSecurityException {
        // implementation
    }

    public static KeyPair fromBip39Seed(byte[] bip39Seed, int accountNumber) throws GeneralSecurityException {
        // implementation
    }

    public static KeyPair random() throws GeneralSecurityException {
        // implementation
    }

    public String getAccountId() {
        // implementation
    }

    public char[] getSecretSeed() {
        // implementation
    }

    public byte[] getPublicKey() {
        // implementation
    }

    public SignatureHint getSignatureHint() {
        // implementation
    }

    public PublicKey getXdrPublicKey() {
        // implementation
    }

    public SignerKey getXdrSignerKey() {
        // implementation
    }

    public static KeyPair fromXdrPublicKey(PublicKey key) throws GeneralSecurityException {
        // implementation
    }

    public static KeyPair fromXdrSignerKey(SignerKey key) throws GeneralSecurityException {
        // implementation
    }

    public byte[] sign(byte[] data) throws GeneralSecurityException {
        // implementation
    }

    public DecoratedSignature signDecorated(byte[] data) throws GeneralSecurityException {
        // implementation
    }

    public DecoratedSignature signPayloadDecorated(byte[] signerPayload) throws GeneralSecurityException {
        // implementation
    }

    public boolean verify(byte[] data, byte[] signature) throws GeneralSecurityException {
        // implementation
    }

    @Override
    public boolean equals(Object object) {
        // implementation
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicKey);
    }

}