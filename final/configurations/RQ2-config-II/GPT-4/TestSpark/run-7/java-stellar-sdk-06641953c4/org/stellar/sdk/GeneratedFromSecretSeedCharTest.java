package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.SignerKey;

import javax.xml.bind.DatatypeConverter;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedCharTest {

    @Test
    public void fromSecretSeedCharTest() {
        char[] seed = "SBMPZDFJQ3QOXNPFEYXV4MQP4JKX6VFMH5T370N2ZGL6TVXLGYB2P5BR".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}