package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void canSign() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret seed".toCharArray());
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_WithCorrectSeed_ReturnsKeyPair() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret seed".toCharArray());
        assertNotNull(keyPair);
        assertTrue(keyPair.getSecretSeed().length == 32);
    }

    @Test
    public void random() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountId_[
    MethodUnderTest]

    Test() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret seed".toCharArray());
        assertEquals(0, 0, keyPair.getAccountId().compareTo(Integer.toString(0)));
    }

    @Test
    public void sign_[
    MethodUnderTest]

    Test() throws GeneralSecurityException {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "data".getBytes();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Signature signature = keyPair.sign(data);
        assertTrue(signature.verify(data, signature));
    }

    @Test
    public void fromAccountId_[
    MethodUnderTest]

    Test() throws IOException {
        KeyPair keyPair = KeyPair.fromAccountId("account_id");
        assertNotNull(keyPair);
    }

    @Test
    public void getPublicKey_[
    MethodUnderTest]

    Test() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret seed".toCharArray());
        byte[] publicKeyBytes = keyPair.getPublicKey();
        assertTrue(publicKeyBytes.length == 33);
    }

    @Test
    public void fromXdrPublicKey_[
    MethodUnderTest]

    Test() {
        PublicKey publicKey = new PublicKey(new Uint256(0));
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair);
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}