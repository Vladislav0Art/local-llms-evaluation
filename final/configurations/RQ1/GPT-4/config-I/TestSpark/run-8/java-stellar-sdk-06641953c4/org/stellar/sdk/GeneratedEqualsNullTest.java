package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;

public class GeneratedEqualsNullTest {

    @Test
    public void equalsNullTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertFalse(keyPair.equals(null));
    }

}