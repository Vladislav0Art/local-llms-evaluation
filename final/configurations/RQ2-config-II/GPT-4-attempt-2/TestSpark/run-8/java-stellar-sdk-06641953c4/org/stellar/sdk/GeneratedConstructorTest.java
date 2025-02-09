package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[32]);
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

}