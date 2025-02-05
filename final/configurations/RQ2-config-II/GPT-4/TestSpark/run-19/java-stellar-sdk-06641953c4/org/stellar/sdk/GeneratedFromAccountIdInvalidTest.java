package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdInvalidTest {

    @Test
    public void fromAccountIdInvalidTest() {
        String accountId = "XYZ"; // invalid accountId
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
    }

}