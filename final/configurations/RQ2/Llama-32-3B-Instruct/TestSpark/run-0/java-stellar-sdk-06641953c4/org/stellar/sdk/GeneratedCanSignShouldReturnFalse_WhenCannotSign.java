package org.stellar.sdk;

public class GeneratedCanSignShouldReturnFalse_WhenCannotSign {

    @Test
    public void canSignShouldReturnFalse_WhenCannotSign() {
        // This test requires mocking to set up a scenario where signing fails.
        EdDSAEngine engine = Mockito.mock(EdDSAEngine.class);
        Mockito.when(engine.generateSignature(Mockito.any(), Mockito.any())).thenThrow(SignatureException.class);
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generateRandom());
        assertFalse(keyPair.canSign());
    }

}