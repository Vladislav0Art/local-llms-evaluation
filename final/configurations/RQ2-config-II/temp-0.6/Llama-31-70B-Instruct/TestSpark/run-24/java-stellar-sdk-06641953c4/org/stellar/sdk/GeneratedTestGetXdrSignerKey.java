package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.PublicKey;

import static org.junit.Assert.*;

public class GeneratedTestGetXdrSignerKey {

    @Test
    public void testGetXdrSignerKey() {
        PublicKey key = new PublicKey();
        key.setType(PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        key.setEd25519(new Uint256(new byte[32]));
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertEquals(key, keyPair.getXdrSignerKey());
    }

}