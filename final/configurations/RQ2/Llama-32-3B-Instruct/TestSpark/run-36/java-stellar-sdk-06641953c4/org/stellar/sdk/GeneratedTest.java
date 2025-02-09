package org.stellar.sdk;

public class GeneratedTest {

    private byte[] encoded;

    public EdDSAPublicKey(byte[] encoded) {
        this.encoded = encoded;
    }

    public byte[] getEncoded() {
        return encoded;
    }
}

public class EdDSAEngine {

    private KeyPair keyPair;

    public void generateKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }

    public KeyPair getKeyPair() {
        return keyPair;
    }
}

public class KeyPair {

    private EdDSAPublicKey publicKey;

    public KeyPair(EdDSAPublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public byte[] getPublicKey() {
        return publicKey.getEncoded();
    }

    public void setSignatureHint(SignatureHint signatureHint) {
        this.publicKey.setHint(signatureHint.getHint());
    }

    public SignatureHint getSignatureHint() {
        return new SignatureHint(publicKey.getHint());
    }
}

public class EdDSAPrivateKeySpec extends Object {

    private char[] seed;

    public EdDSAPrivateKeySpec(char[] seed) {
        this.seed = seed;
    }

    @Override
    public String toString() {
        return "EdDSAPrivateKeySpec{" +
                "seed=" + java.util.Arrays.toString(seed) +
                '}';
    }
}

public class SignatureHint {

    private String hint;

    public SignatureHint(String hint) {
        this.hint = hint;
    }

    public String getHint() {
        return hint;
    }
}

public class KeyPairTest {

}