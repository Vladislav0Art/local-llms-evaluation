package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        char[] secretSeed = new EdDSAPublicKey().generateSecretSeed();
        PublicKey publicKey = new EdDSAPublicKey().sign(secretSeed);

        // verify signature hint
        SignatureHint hint = Objects.toString(publicKey.getXdrPublicKey().getSignatureHint());
        assertEquals(EdDSAPrivateKeySpec.class, hint.getClass());

        // verify EdDSA private key
        EdDSAPrivateKeySpec spec = new EdDSAPrivateKeySpec("private seed", 0);
        KeyPair fromSecretSeedFromSpec = KeyPair.fromXdrPrivKeyFromSpec(spec);
        assertTrue(fromSecretSeedFromSpec.canSign());
    }

}