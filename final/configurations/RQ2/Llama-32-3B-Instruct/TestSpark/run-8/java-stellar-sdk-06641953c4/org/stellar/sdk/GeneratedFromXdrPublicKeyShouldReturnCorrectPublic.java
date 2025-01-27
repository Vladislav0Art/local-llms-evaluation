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

public class GeneratedFromXdrPublicKeyShouldReturnCorrectPublic {

    @Test
    public void fromXdrPublicKeyShouldReturnCorrectPublic() {
        PublicKey publicKey = new PublicKey(new byte[]{1, 2, 3});
        EdDSAPublicKey expectedPublicKey = EdDSAPrivateKey.generate().getPublic();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertTrue(Objects.equals(expectedPublicKey, keyPair.getPublic()));
    }

}