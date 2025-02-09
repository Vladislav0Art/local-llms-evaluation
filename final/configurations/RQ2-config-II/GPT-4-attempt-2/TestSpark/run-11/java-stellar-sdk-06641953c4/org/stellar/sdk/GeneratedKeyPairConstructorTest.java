package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedKeyPairConstructorTest {

    @Test
    public void KeyPairConstructorTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519));
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertNotNull(keyPair);
    }

}