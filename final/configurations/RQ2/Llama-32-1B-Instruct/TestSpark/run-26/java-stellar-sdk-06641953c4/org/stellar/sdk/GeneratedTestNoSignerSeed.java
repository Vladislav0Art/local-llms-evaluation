package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestNoSignerSeed {

    @Test
    public void testNoSignerSeed() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPair(new byte[0]);
        assertFalse(keyPair.canSign());
    }

}