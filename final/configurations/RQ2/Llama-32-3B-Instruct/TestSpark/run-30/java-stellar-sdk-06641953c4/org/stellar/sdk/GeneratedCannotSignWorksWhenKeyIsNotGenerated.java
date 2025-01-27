package org.stellar.sdk;

public class GeneratedCannotSignWorksWhenKeyIsNotGenerated {

    @Test
    public void cannotSignWorksWhenKeyIsNotGenerated() {
        assertNull(KeyPair.fromSecretSeed(new char[0]));
        assertTrue(KeyPair.fromSecretSeed(new byte[0]).canSign());
    }

}