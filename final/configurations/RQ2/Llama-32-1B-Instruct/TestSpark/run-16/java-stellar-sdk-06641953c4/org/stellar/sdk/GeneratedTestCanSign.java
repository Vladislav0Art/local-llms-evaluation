package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair key = new KeyPair(EdDSAPublicKey.fromXdr(new byte[]{1, 2, 3}));
        Preconditions.checkState(key.canSign());
    }

}