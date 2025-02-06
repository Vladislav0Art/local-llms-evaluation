package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCode_ReturnsUniqueHashCode {

    @Test
    public void hashCode_ReturnsUniqueHashCode() throws GeneralSecurityException {
        KeyPair keyPair1 = new KeyPair(null);
        KeyPair keyPair2 = new KeyPair(null);
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}