package org.stellar.sdk;

public class GeneratedCanSignWorksWhenKeyIsGenerated {

    @Test
    public void canSignWorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

}