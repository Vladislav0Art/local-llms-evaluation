package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.XdrDataOutputStream;
import org.stellar.sdk.XdrDataInputStream;

public class GeneratedTest {

    @Test
    public void testXdrPublicKey() throws Exception {
        byte[] publicKey = KeyPair.fromPublicKey(new XdrDataOutputStream(new ByteArrayOutputStream()));
        assertEquals(publicKey.length, 32);
        assertNotNull(publicKey);
    }

    @Test
    public void testFromBip39Seed() throws Exception {
        String bip39Seed = "bip39_seed";
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed);
        assertNotNull(keyPair.getSecretSeed());
    }
}

@Test
public void testFromXdrSignature() throws Exception {
    byte[] signatureBytes = XdrDataOutputStream.newInstance().putBoolean(true).finalize();
    KeyPair signerKey = KeyPair.fromXdr(signatureBytes);
    assertNotNull(signerKey.getPublic());
}

@Test
public void testFromXdrAddress() throws Exception {
    String address = "1QjB8pWu2U5rA3Z9iK1eNp2bYfRg9s4c";
    KeyPair keyPair = KeyPair.fromXdr(address);
    assertNotNull(keyPair.getPublic());
}

@Test
public void testFromXdrAddressAndSeed() throws Exception {
    String address = "1QjB8pWu2U5rA3Z9iK1eNp2bYfRg9s4c";
    byte[] seedBytes = XdrDataOutputStream.newInstance().putBoolean(true).finalize();
    KeyPair keyPair = KeyPair.fromXdr(address, seedBytes);
    assertNotNull(keyPair.getPublic());
}
		}

public class GeneratedTest {

    public static void main(String[] args) throws Exception {
        TestGeneratedTest testGeneratedTest = new TestGeneratedTest();

        // Public Key
        byte[] publicKeyBytes = KeyPair.getPublicKey();
        testGeneratedTest.testXdrPublicKey();

        // XDR Signature
        byte[] signatureBytes = XdrDataOutputStream.newInstance().putBoolean(true).finalize();
        testGeneratedTest.testFromXdrSignature();

        // Address
        String address = "1QjB8pWu2U5rA3Z9iK1eNp2bYfRg9s4c";
        KeyPair keyPair = KeyPair.fromAddress(address);
        testGeneratedTest.testFromXdrAddress();

        // XDR Address and Seed
        String addressStr = "1QjB8pWu2U5rA3Z9iK1eNp2bYfRg9s4c";
        byte[] seedBytes = XdrDataOutputStream.newInstance().putBoolean(true).finalize();
        KeyPair keyPair = KeyPair.fromAddress(addressStr, seedBytes);
        testGeneratedTest.testFromXdrAddressAndSeed();
    }

}