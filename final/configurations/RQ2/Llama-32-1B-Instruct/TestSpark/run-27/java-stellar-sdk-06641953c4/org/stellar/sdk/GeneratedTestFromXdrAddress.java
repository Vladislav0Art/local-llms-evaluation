package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.XdrDataOutputStream;
import org.stellar.sdk.XdrDataInputStream;

public class GeneratedTestFromXdrAddress {

    @Test
    public void testFromXdrAddress() throws Exception {
        String address = "1QjB8pWu2U5rA3Z9iK1eNp2bYfRg9s4c";
        KeyPair keyPair = KeyPair.fromXdr(address);
        assertNotNull(keyPair.getPublic());
    }

}