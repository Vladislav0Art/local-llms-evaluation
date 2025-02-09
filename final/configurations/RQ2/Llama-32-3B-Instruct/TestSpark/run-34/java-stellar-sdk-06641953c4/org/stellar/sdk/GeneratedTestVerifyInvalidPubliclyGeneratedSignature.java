package org.stellar.sdk;

public class GeneratedTestVerifyInvalidPubliclyGeneratedSignature {

    public static class KeyPair {
        private byte[] publicKey;
        private byte[] privateKey;

        public KeyPair(byte[] publicKey, byte[] privateKey) {
            this.publicKey = publicKey;
            this.privateKey = privateKey;
        }

        public void sign(byte[] data) throws SignatureException {
            // implementation
        }

        public boolean verify(byte[] data) {
            return true; // for testing purposes
        }
    }

    public static class Signature {
        private byte[] signature;

        public Signature(byte[] signature) {
            this.signature = signature;
        }

        @Override
        public String toString() {
            return "Signature{" +
                    "signature=" + java.util.Arrays.toString(signature) +
                    '}';
        }
    }

    public static class DecoratedSignature {
        private byte[] data;

        public DecoratedSignature(byte[] data, byte[] publicKey) {
            this.data = data;
        }

        public byte[] getData() {
            return data;
        }
    }

    @Test
    public void testVerifyInvalidPubliclyGeneratedSignature() throws Exception {
        KeyPair keyPair = new KeyPair(new byte[]{1, 2, 3}, new byte[]{4, 5, 6});
        Signature signature = new Signature(keyPair.sign(new byte[]{7, 8, 9}));
        DecoratedSignature decoratedSignature = new DecoratedSignature(signature.getData(), keyPair.publicKey);
        assertFalse(keyPair.verify(decoratedSignature.getData()));
    }

}