package org.stellar.sdk;

public class GeneratedTestCanSign_PassingToCanSign {

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
    public void testCanSign_PassingToCanSign() throws SignatureException, IOException {
        verify(pair.canSign());
        mockEdDSAPublicKey = new MockEdDSAPublicKey();
        mockEdDSAPublicKey.setAlgorithm(EdDSAAlgorithm.EdDSA_P256);
        when(eddsaEngine.getAlgorithm()).thenReturn(mockEdDSAPublicKey.getAlgorithm());
    }

}