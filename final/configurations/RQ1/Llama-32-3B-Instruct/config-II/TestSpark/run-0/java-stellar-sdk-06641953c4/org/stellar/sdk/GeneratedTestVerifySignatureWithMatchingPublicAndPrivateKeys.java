package org.stellar.sdk;

public class GeneratedTestVerifySignatureWithMatchingPublicAndPrivateKeys {

    private String type;
    private Uint256 publicKey;
    private SignerKey signerKey;
    private byte[] secretKey;

    // getters and setters
}

public class EdDSSignerKey {

    public static EdDSSignerKey fromXdrPublicKey(PublicKey key) {
        return new EdDSSignerKey(key.getEd25519().getUint256());
    }

    public static EdDSSignerKey fromSecretKey(KeyPair keyPair, byte[] secretKey) {
        return new EdDSSignerKey(new SignerKey(new Uint256(secretKey)), keyPair.mPublicKey);
    }
}

public class KeyPairValidator {

    public boolean verify(byte[] data, byte[] signature, KeyPair keyPair) {
        return keyPair.verify(data, signature);
    }

    public static boolean validate(KeyPair keyPair) {
        if (keyPair.getSignerKey() == null || keyPair.getPublicKey() == null) {
            return false;
        }
        return true;
    }
}

public class KeyPairTests {

    @Test
    public void testVerifySignatureWithMatchingPublicAndPrivateKeys() {
        KeyPair keyPair = new KeyPair();
        byte[] data = "Hello World!".getBytes();
        byte[] signature = keyPair.sign(data);
        Assertions.assertTrue(KeyPairValidator.verify(data, signature), "Verification failed");
    }

}