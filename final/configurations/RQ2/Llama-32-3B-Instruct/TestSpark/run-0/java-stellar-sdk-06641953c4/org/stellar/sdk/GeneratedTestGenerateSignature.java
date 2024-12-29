package org.stellar.sdk;

public class GeneratedTestGenerateSignature {

    @Test
    public void testGenerateSignature() {
        // Arrange
        Keypair keyPair = new Keypair(KeypairType.RSASEED, KeypairType.SECRETKEY);
        KeypairType type = KeypairType.DERIVE;
        byte[] seed = "valid_seed".getBytes();

        // Act and Assert
        SignatureException exception = assertThrows(SignatureException.class, () ->
                generateSignature(keyPair, type, seed));
    }

    private void generateSignature(Keypair keyPair, KeypairType type, byte[] seed) {
        KeyDerivationContext ctx = new KeyDerivationContext();
        ctx.initKeyMaterial(keyPair.getSecret());
        Key material = deriveKey(ctx, keyPair, type);
        Signature sig = new Signature();
        sig.sign(material);
    }

    private byte[] deriveKey(KeyDerivationContext ctx, Keypair keyPair, KeypairType type) {
        if (keyPair instanceof RSAPrivateKey) {
            RsaKeypair rsa = (RsaKeypair) keyPair;
            return rsa.deriveDeriveKey(ctx);
        } else if (keyPair instanceof ECPrivateKey) {
            ECDeriveKey ecd = ((ECPrivateKey) keyPair).deriveDeriveKey(ctx);
            return ecd.getEncoded();
        }
        throw new UnsupportedOperationException();
    }

}