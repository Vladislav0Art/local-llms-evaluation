package org.stellar.sdk;

import org.junit.Test;

import java.security.PublicKey;
import java.security.Signature;

public class GeneratedTestGetSignerKey {

    @Test
    public void testGetSignerKey() {
        SignerKey signerKey = sign(new byte[0]);
        System.out.println(signerKey);
    }

}