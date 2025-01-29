package org.stellar.sdk;

import org.junit.Test;

import java.security.PublicKey;
import java.security.Signature;

public class GeneratedTestGenerateSignature {

    @Test
    public void testGenerateSignature() {
        byte[] data = "Hello, World!".getBytes();
        PublicKey publicKey = new PublicKey("public-key");
        SignatureKey key = sign(data);

        SignerKey xdrSignerKey = xdrSigner(key);

        String signature = getSignature(xdrSignerKey);
        System.out.println("Generated signature: " + signature);

        DecoratedSignature decoratedSignature = getDecoratedSignature(publicKey, signature);

        Preconditions.assertEquals(decoratedSignature, getDecoratedSignature(data, signature));
    }

    public SignerKey sign(byte[] payload) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] encoded = payload;
        byte[] decoded = bos.toByteArray();

        return new SignatureKey(encoded);
    }

    public DecoratedSignature getDecoratedSignature(byte[] data, String signature) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] decoded = data;
        byte[] encoded = signature.getBytes();

        bos.write(decoded);
        bos.write(encoded);

        return new DecoratedSignature(bos.toByteArray());
    }

}