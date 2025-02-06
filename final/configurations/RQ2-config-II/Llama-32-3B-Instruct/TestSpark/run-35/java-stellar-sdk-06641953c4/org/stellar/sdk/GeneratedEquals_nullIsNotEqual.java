package org.stellar.sdk;

public class GeneratedEquals_nullIsNotEqual {

    @Test
    public void equals_nullIsNotEqual() {
        assert (!new KeyPair(new EdDSAPublicKey()).equals(null));
    }

}