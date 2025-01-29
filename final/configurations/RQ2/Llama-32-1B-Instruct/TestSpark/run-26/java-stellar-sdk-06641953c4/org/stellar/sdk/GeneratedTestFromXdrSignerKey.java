package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        KeyPair keyPair = new KeyPair(new SignerKey());
        assertTrue(keyPair.canSign());

        // verify signature hint
        SignatureHint hint = Objects.toString(keyPair.getXdrSignerKey().getSignatureHint());
        assertEquals(EdDSAPrivateKeySpec.class, hint.getClass());

        // verify EdDSA private key
        EdDSAPrivateKeySpec spec = new EdDSAPrivateKeySpec("private seed", 0);
        KeyPair fromXdrSignerKeyFromSpec = KeyPair.fromXdrPrivKeyFromSpec(spec);
        assertTrue(fromXdrSignerKeyFromSpec.canSign());
    }

}