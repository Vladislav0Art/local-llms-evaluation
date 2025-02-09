package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSign {

    @Test
    public void testSign() throws Exception {
        KeyPair keyPair = new KeyPair(new byte[]{1, 2, 3}, new byte[]{4, 5, 6});
        ByteArrayOutputStream ByteArrayOutputStream = new ByteArrayOutputStream();
        byte[] signature = new byte[]{7, 8, 9};
        assertEquals(signature, keyPair.sign(signature));
    }
}

}