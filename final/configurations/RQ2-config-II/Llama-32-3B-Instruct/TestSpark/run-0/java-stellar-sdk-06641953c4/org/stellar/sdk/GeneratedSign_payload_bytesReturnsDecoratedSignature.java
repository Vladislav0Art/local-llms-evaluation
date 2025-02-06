package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedSign_payload_bytesReturnsDecoratedSignature {

    @Test
    public void sign_payload_bytesReturnsDecoratedSignature() throws IOException, GeneralSecurityException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream out = new XdrDataOutputStream(bos);
        Uint256 data = Uint256.valueOf(1L);
        Signature signature = Signature.getInstance("SHA256withED25519");
        signature.initSign(null);
        signature.update(data.getBytes());
        signature.sign(bos.toByteArray());
        bos.flush();
        byte[] signerPayload = "signerPayload".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(signatureBytes);
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(signerPayload);
        assertNotNull(decoratedSignature.getPublicKey());
    }

}