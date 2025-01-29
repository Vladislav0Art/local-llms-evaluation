package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.canSign());
    }

}