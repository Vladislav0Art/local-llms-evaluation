package org.stellar.sdk;

public class GeneratedTestGetXdrPublicKey_Signing {

    private static KeyPair pair;
    private static MockEdDSAPublicKey mockEdDSAPublicKey;

    @Mock
    public EdDSAEngine eddsaEngine;

    @Mock
    public EdDSEnabledCurveTable enabledCurveTable;

    @Before
    public void setup() {
        PairUtil.copyFromSecretSeed("secret_seed", "1234567890abcdef");
    }

    @Test
    public void testGetXdrPublicKey_Signing() throws SignatureException, IOException {
        verify(pair.getXdrPublicKey(), times(1));
        mockEdDSAPublicKey = new MockEdDSAPublicKey();
        when(eddsaEngine.getAlgorithm()).thenReturn(mockEdDSAPublicKey.getAlgorithm());
        pair.sign("secret_seed");
    }

}