package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        KeyPair pair = KeyPair.fromPublicKey(("GB3JDWCQJCWMJ3IILWIGDTQKZKPZ2UOJSUZMJM26K3QUL3RBJ45RNJTS").getBytes());
        assertNotNull(pair);
    }

}