package org.stellar.sdk;

public class GeneratedTestGenerateRandomXDRSignerKey {

    @Test
    public void testGenerateRandomXDRSignerKey() {
        byte[] signerKey = generateRandomXDRSignerKey();
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKeySpec(signerKey));
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(signerKey.length, keyPair.getXDRSignerKey().length, "xdr signer key length");
    }

    private byte[] generateRandomSecretSeed() {
        return generateRandomBytes(32);
    }

    private byte[] generateRandomXDRPublicKey() {
        return generateRandomBytes(256);
    }

    private byte[] generateRandomXDRSignerKey() {
        return generateRandomBytes(16);
    }

    private String generateRandomSignatureHint() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append((char) ('a' + i));
        }
        return sb.toString();
    }

    private byte[] generateRandomBytes(int length) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            while (true) {
                byte[] chunk = new byte[length];
                int bytesRead = bos.read(chunk);
                if (bytesRead == -1) {
                    break;
                }
                bos.write(chunk, 0, bytesRead);
            }
            return bos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getSignature(KeyPair keyPair, byte[] data) throws SignatureException {
        byte[] signature = keyPair.sign(data);
        StringBuilder sb = new StringBuilder();
        for (byte b : signature) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    private void assertNotNull(Object o) {
        assertNotNull(o);
    }

}