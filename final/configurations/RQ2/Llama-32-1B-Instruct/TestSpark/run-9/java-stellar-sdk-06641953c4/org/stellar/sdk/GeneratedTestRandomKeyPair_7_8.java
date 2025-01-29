package org.stellar.sdk;

public class GeneratedTestRandomKeyPair_7_8 {

    @Test
    public void testRandomKeyPair_7_8() {
        KeyPair key = KeyPair.random();
        Preconditions.assertArrayEquals(Arrays.asList("eddsa", "xdr"), key.getTypes());
    }

}