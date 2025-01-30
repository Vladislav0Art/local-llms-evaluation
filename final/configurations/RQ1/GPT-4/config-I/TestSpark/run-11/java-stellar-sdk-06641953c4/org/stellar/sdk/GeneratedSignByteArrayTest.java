package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.Uint256;

import java.security.KeyPairGenerator;

import static org.junit.Assert.*;

public class GeneratedSignByteArrayTest {

    @Test
    public void signByteArrayTest() {
        byte[] dataToSign = new byte[32];
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], KeyPair.ed25519));

        KeyPair keyPair = new KeyPair(publicKey, privateKey);

        assertNotNull(keyPair.sign(dataToSign));
    }

}