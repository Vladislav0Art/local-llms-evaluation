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

public class GeneratedTest {

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SBR25NMQRKQ4LRB5CFI23BNBZSJ4GMEGWGJEWO4SXCHQTCO6OH5A7K5P");
        assertNotNull(pair);
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SBR25NMQRKQ4LRB5CFI23BNBZSJ4GMEGWGJEWO4SXCHQTCO6OH5A7K5P".toCharArray());
        assertNotNull(pair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SBR25NMQRKQ4LRB5CFI23BNBZSJ4GMEGWGJEWO4SXCHQTCO6OH5A7K5P".getBytes());
        assertNotNull(pair);
    }

    @Test
    public void randomTest() {
        KeyPair pair = KeyPair.random();
        assertNotNull(pair);
        assertTrue(pair.canSign());
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair pair = KeyPair.fromAccountId("GB3JDWCQJCWMJ3IILWIGDTQKZKPZ2UOJSUZMJM26K3QUL3RBJ45RNJTS");
        assertNotNull(pair);
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair pair = KeyPair.fromPublicKey(("GB3JDWCQJCWMJ3IILWIGDTQKZKPZ2UOJSUZMJM26K3QUL3RBJ45RNJTS").getBytes());
        assertNotNull(pair);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair2));
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = new byte[]{(byte) 1};
        KeyPair pair = KeyPair.fromBip39Seed(bip39Seed, 0);
        assertNotNull(pair);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ED25519_CURVE_SPEC));
        PublicKey publicKey = new PublicKey();
        publicKey.setEd25519(edDSAPublicKey.getAbyte());
        KeyPair pair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(pair);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKey = new SignerKey();
        signerKey.setEd25519(new byte[32]);
        KeyPair pair = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(pair);
    }

}