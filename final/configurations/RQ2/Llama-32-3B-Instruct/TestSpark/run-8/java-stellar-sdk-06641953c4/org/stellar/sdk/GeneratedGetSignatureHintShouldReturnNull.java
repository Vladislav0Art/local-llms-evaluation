package org.stellar.sdk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;

public class GeneratedGetSignatureHintShouldReturnNull {

    @Test
    public void getSignatureHintShouldReturnNull() {
        KeyPair keyPair = KeyPair.random();
        assertNull(keyPair.getSignatureHint());
    }

}