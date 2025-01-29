package org.stellar.sdk;

public class GeneratedTestRandomKeyPair_1_2 {

    @Test
    public void testRandomKeyPair_1_2() {
        KeyPair key = KeyPair.random();
        Preconditions.assertArrayEquals(Arrays.asList("eddsa", "xdr"), key.getTypes());
    }

}