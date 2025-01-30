package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.Utils;
import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.StrKey;

import java.security.spec.InvalidKeySpecException;

import static org.junit.Assert.*;

public class GeneratedVerifyWithoutDataTest {

    @Test
    public void verifyWithoutDataTest() {
        KeyPair keyPair = new KeyPair(KeyPair.fromAccountId("GB3C6RRLEP46VTD66ZE5DVHWWDPCDJYRDID3XGC64QL7UYVTDZSH2NPK").mPublicKey);
        byte[] signature = keyPair.sign("Test".getBytes());
        keyPair.verify(null, signature);
    }

}