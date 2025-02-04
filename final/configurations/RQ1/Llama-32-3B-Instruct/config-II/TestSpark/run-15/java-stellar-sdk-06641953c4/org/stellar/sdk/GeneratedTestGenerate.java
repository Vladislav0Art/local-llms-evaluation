package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestGenerate {

    // ...

    @Override
    public int hashCode() {
        return Objects.hashCode(this.mPrivateKey, this.mPublicKey);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof KeyPair)) {
            return false;
        }

        KeyPair other = (KeyPair) object;
        return this.mPrivateKey.equals(other.mPrivateKey) &&
                this.mPublicKey.equals(other.mPublicKey);

    }
}

// PublicKeyGenerator.java

public class PublicKeyGenerator {
    public static KeyPair generate() throws Exception {
        // Generate a new key pair
        KeyPair keyPair = new KeyPair();

        // Sign the public key to verify its authenticity
        byte[] publicKeyBytes = keyPair.getPublicKey();
        Signature sgr = new EdDSAEngine(MessageDigest.getInstance("SHA-512"));
        sgr.initSign(keyPair.mPrivateKey);
        sgr.update(publicKeyBytes);
        byte[] signature = sgr.sign();

        // Verify the public key's signature
        if (!keyPair.verify(publicKeyBytes, signature)) {
            throw new Exception("Invalid public key");
        }

        return keyPair;
    }
}

// KeyPairGeneratorTest.java

import org.junit.Test;

public class KeyPairGeneratorTest {

    @Test
    public void testGenerate() throws Exception {
        KeyPair keyPair = PublicKeyGenerator.generate();
        // Verify the generated key pair is valid
        boolean isValid = true;
        if (keyPair.mPrivateKey == null) {
            isValid = false;
        } else {
            byte[] publicKeyBytes = keyPair.getPublicKey();
            Signature sgr = new EdDSAEngine(MessageDigest.getInstance("SHA-512"));
            sgr.initSign(keyPair.mPrivateKey);
            sgr.update(publicKeyBytes);
            byte[] signature = sgr.sign();
            if (!keyPair.verify(publicKeyBytes, signature)) {
                isValid = false;
            }
        }
        assert isValid;
    }

}