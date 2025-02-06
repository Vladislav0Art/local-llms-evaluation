package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private EdDSAPrivateKey privateKeyMock;

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void constructor_KnownPublicKeypair_SetsCorrectProperties() {
        // Arrange
        publicKeyMock.setEncoded("mockedEncoded");
        keyPair = new KeyPair(publicKeyMock);

        // Act & Assert
        assertEquals("mockedEncoded", keyPair.getPublicKey());
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_DifferentSeeds_ReturnsDifferentKeypair() {
        // Arrange
        char[] seed1 = "seed1".toCharArray();
        char[] seed2 = "seed2".toCharArray();

        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed1);
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed2);

        // Act & Assert
        assertNotEquals(keyPair1.getPublicKey(), keyPair2.getPublicKey());
    }

    @Test
    public void fromAccountId_MultipleAccountIds_ReturnsDifferentKeypair() {
        // Arrange
        String accountId1 = "accountId1";
        String accountId2 = "accountId2";

        KeyPair keyPair1 = KeyPair.fromAccountId(accountId1);
        KeyPair keyPair2 = KeyPair.fromAccountId(accountId2);

        // Act & Assert
        assertNotEquals(keyPair1.getPublicKey(), keyPair2.getPublicKey());
    }

    @Test
    public void sign_DifferentData_ReturnsDifferentSignatures() {
        // Arrange
        byte[] data1 = "data1".getBytes();
        byte[] data2 = "data2".getBytes();

        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("mockedEncoded"));

        // Act & Assert
        ByteArrayOutputStream bos1 = new ByteArrayOutputStream();
        XdrDataOutputStream out1 = new XdrDataOutputStream(bos1);
        DecoratedSignature signature1 = keyPair.sign(data1, out1);
        assertEquals("mockedEncoded", signature1.getPublicKey());
        assertEquals(0, bos1.size());

        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
        XdrDataOutputStream out2 = new XdrDataOutputStream(bos2);
        DecoratedSignature signature2 = keyPair.sign(data2, out2);
        assertEquals("mockedEncoded", signature2.getPublicKey());
        assertEquals(0, bos2.size());
    }

    @Test
    public void verify_DifferentSignatures_ReturnsDifferentResults() {
        // Arrange
        byte[] data = "data".getBytes();
        byte[] signature1 = "signature1".getBytes();
        byte[] signature2 = "signature2".getBytes();

        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("mockedEncoded"));

        // Act & Assert
        boolean result1 = keyPair.verify(data, signature1);
        assertFalse(result1);

        boolean result2 = keyPair.verify(data, signature2);
        assertTrue(result2);
    }

}