package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;

public class GeneratedEqualsAnotherObjectTest {

    @Test
    public void equalsAnotherObjectTest() {
        KeyPair keyPair = KeyPair.random();
        String other = new String("Not a keypair");
        Assert.assertFalse(keyPair.equals(other));
    }

}