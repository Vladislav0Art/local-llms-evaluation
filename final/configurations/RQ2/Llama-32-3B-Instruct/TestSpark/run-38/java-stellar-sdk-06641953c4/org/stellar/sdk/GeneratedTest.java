package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void newKeyPairFromPublic() {
        EdDSAPublicKey publicKey = createEdDsapublickey();
        KeyPair keyPair = KeyPair.fromPublic(publicKey.getEncoded());
        assertNotNull(keyPair);
    }

    @Test
    public void canSignWithValidSecretSeed() {
        char[] seed = createCharArray("1234567890");
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void cannotSignWithInvalidSecretSeed() {
        char[] invalidSeed = createCharArray("invalidseed");
        KeyPair keyPair = KeyPair.fromSecretSeed(invalidSeed);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void getAccountIdReturnsValidAccountId() {
        String accountId = "account123";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getPublickeyReturnsValidPublicKey() {
        byte[] publicKey = createByteArray("publickey");
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void getSecretSeedReturnsCorrectSecretSeed() {
        char[] seed = createCharArray("1234567890");
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertArrayEquals(seed, keyPair.getSecretSeed());
    }

    @Test
    public void signWithValidDataReturnsValidSignature() {
        byte[] data = createByteArray("data");
        Signature signature = new Signature(data, "signature");
        byte[] expectedSignature = Arrays.copyOfRange(signature.signatureBytes(), 0, 16);
        KeyPair keyPair = KeyPair.fromSecretSeed(createCharArray("1234567890"));
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        assertEquals(expectedSignature, decoratedSignature.signature);
    }

    @Test
    public void verifyWithValidDataAndSignatureReturnsTrue() {
        byte[] data = createByteArray("data");
        Signature signature = new Signature(data, "signature");
        KeyPair keyPair = KeyPair.fromSecretSeed(createCharArray("1234567890"));
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void verifyWithInvalidDataAndSignatureReturnsFalse() {
        byte[] invalidData = createByteArray("invaliddata");
        Signature signature = new Signature(invalidData, "signature");
        KeyPair keyPair = KeyPair.fromSecretSeed(createCharArray("1234567890"));
        assertFalse(keyPair.verify(invalidData, signature));
    }

    @Test
    public void hashCodeReturnsValidHashcode() {
        int hashcode = 12345;
        KeyPair keyPair = new KeyPair();
        keyPair.hashCode();
        assertEquals(hashcode, keyPair.hashCode());
    }

    @Test
    public void equalsWithSameKeyPairReturnsTrue() {
        KeyPair keyPair1 = new KeyPair();
        KeyPair keyPair2 = new KeyPair();
        assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void equalsWithDifferentKeyPairReturnsFalse() {
        KeyPair keyPair1 = new KeyPair();
        KeyPair keyPair2 = new KeyPair();
        assertFalse(keyPair1.equals(new Object()));
    }

}