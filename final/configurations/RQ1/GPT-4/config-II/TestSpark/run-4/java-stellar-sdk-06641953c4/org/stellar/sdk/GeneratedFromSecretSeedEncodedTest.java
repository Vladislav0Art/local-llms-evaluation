package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.Uint256;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedEncodedTest {

    @Test
    public void fromSecretSeedEncodedTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SBUV3MRGZURLG2ZTA2QOKUYNS4T2JX2KH6FBDAHVDIOHYUM5ERIJV7JZ".toCharArray());
        assertNotNull(keyPair);
    }

}