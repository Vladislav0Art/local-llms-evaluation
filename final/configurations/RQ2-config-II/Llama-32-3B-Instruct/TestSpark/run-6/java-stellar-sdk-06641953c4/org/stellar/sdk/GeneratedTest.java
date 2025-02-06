package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void constructor_WithPublicKey_ReturnsExpected() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.getEncoded()).thenReturn(new byte[]{1, 2, 3});
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void canSign_WhenPublicKeyIsNotNull_ReturnsTrue() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.getEncoded()).thenReturn(new byte[]{1, 2, 3});
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void canSign_WhenPublicKeyIsNull_ReturnsFalse() {
        KeyPair keyPair = new KeyPair(null);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_WithCharArray_ReturnsExpected() {
        char[] seed = "hello".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_WithString_ReturnsExpected() {
        String seed = "hello";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_WithByteArray_ReturnsExpected() {
        byte[] seed = "hello".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountId_WhenAccountIdIsNotNull_ReturnsExpected() {
        String accountId = "12345";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKey_WithByteArray_ReturnsExpected() {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void fromBip39Seed_WithCharArray_ReturnsExpected() {
        char[] bip39Seed = "hello".toCharArray();
        int accountNumber = 12345;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

    @Test
    public void fromXdrPublicKey_WithPublicKey_ReturnsExpected() {
        PublicKey publicKey = Mockito.mock(PublicKey.class);
        when(publicKey.getEncoded()).thenReturn(new byte[]{1, 2, 3});
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountId_WhenKeyPairIsNull_ReturnsNull() {
        KeyPair keyPair = null;
        assertNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeed_WhenKeyPairIsNull_ReturnsNull() {
        KeyPair keyPair = null;
        assertNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKey_WhenKeyPairIsNull_ReturnsEmptyByteArray() {
        KeyPair keyPair = null;
        assertTrue(Arrays.equals(keyPair.getPublicKey(), new byte[0]));
    }

    @Test
    public void sign_WithByteArray_ReturnsExpectedSignature() throws SignatureException {
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = Mockito.mock(byte[].class);
        when(publicKey.sign(data)).thenReturn(signature);
        KeyPair keyPair = new KeyPair(mockPublickey);
        byte[] resultSignature = keyPair.sign(data);
        assertNotNull(resultSignature);
    }

    @Test
    public void verify_WithByteArrayAndSignature_ReturnsTrue() throws SignatureException {
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = Mockito.mock(byte[].class);
        when(publicKey.verify(data)).thenReturn(true);
        KeyPair keyPair = new KeyPair(mockPublickey);
        boolean resultVerify = keyPair.verify(data, signature);
        assertTrue(resultVerify);
    }

}