package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.security.MessageDigest;

public class GeneratedFromPublicKeyInvalidBytesTest {

    @Test
    public void fromPublicKeyInvalidBytesTest() {
        byte[] publicKeyBytes = new byte[31]; // invalid length

        KeyPair.fromPublicKey(publicKeyBytes);
    }

}