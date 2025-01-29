package org.stellar.sdk;

public class GeneratedTestXdrSignerKey {

    @Test
    public void testXdrSignerKey() throws SignatureException {
        SignerKey signerKey = new SignerKey(EdDSAEngine.create(), EdDSANamedCurveTable.fromNamedCurve("your_named_curve_here"));
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(keyPair.getSignerKey());
        assertEquals(EdDSAPrivateKeySpec.class, keyPair.getSignerKey().getSpec().getClass());
    }

}