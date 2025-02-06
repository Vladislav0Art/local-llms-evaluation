package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedTest {

    @Test
    public void newKeyPair_withValidEdDSAPublicKey_canSign() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.generate();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_bytesCanGenerateKeyPair() {
        byte[] seed = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void fromSecretSeed_stringCanGenerateKeyPair() {
        String seed = "1234567890";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void fromPublicKey_bytesCanGenerateKeyPair() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void random_canGenerateKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getAccountId_returnsAccountId() {
        byte[] seed = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        String accountId = keyPair.getAccountId();
        assertTrue(accountId != null && !accountId.isEmpty());
    }

    @Test
    public void getPublicKey_returnsPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        byte[] expectedPublicKey = keyPair.getPublicKey();
        assertArrayEquals(expectedPublicKey, publicKey);
    }

    @Test
    public void sign_bytesReturnsSignature() throws IOException, GeneralSecurityException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream out = new XdrDataOutputStream(bos);
        Uint256 data = Uint256.valueOf(1L);
        Signature signature = Signature.getInstance("SHA256withED25519");
        signature.initSign(null);
        signature.update(data.getBytes());
        signature.sign(bos.toByteArray());
        bos.flush();
        byte[] signatureBytes = bos.toByteArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(signatureBytes);
        byte[] expectedSignature = keyPair.sign(Uint256.valueOf(1L).getBytes());
        assertArrayEquals(expectedSignature, signatureBytes);
    }

    @Test
    public void sign_payload_bytesReturnsDecoratedSignature() throws IOException, GeneralSecurityException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream out = new XdrDataOutputStream(bos);
        Uint256 data = Uint256.valueOf(1L);
        Signature signature = Signature.getInstance("SHA256withED25519");
        signature.initSign(null);
        signature.update(data.getBytes());
        signature.sign(bos.toByteArray());
        bos.flush();
        byte[] signerPayload = "signerPayload".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(signatureBytes);
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(signerPayload);
        assertNotNull(decoratedSignature.getPublicKey());
    }

    @Test
    public void verify_bytesReturnsTrue() throws IOException, GeneralSecurityException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream out = new XdrDataOutputStream(bos);
        Uint256 data = Uint256.valueOf(1L);
        Signature signature = Signature.getInstance("SHA256withED25519");
        signature.initSign(null);
        signature.update(data.getBytes());
        signature.sign(bos.toByteArray());
        bos.flush();
        byte[] signatureBytes = bos.toByteArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(signatureBytes);
        assertTrue(keyPair.verify(Uint256.valueOf(1L).getBytes(), signatureBytes));
    }

    @Test
    public void verify_bytesReturnsFalseWithDifferentSignature() throws IOException, GeneralSecurityException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream out = new XdrDataOutputStream(bos);
        Uint256 data = Uint256.valueOf(1L);
        Signature signature = Signature.getInstance("SHA256withED25519");
        signature.initSign(null);
        signature.update(data.getBytes());
        signature.sign(bos.toByteArray());
        bos.flush();
        byte[] signatureBytes = bos.toByteArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(signatureBytes);
        assertFalse(keyPair.verify(Uint256.valueOf(1L).getBytes(), Arrays.copyOf(signatureBytes, 32)));
    }

}