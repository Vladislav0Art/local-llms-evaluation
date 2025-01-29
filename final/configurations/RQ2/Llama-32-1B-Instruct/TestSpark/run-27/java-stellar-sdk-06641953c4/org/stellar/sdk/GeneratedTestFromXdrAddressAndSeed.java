package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.XdrDataOutputStream;
import org.stellar.sdk.XdrDataInputStream;

public class GeneratedTestFromXdrAddressAndSeed {

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