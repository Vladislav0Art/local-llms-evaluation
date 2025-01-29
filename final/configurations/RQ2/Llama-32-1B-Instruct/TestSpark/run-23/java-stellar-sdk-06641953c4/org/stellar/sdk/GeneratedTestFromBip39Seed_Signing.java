package org.stellar.sdk;

public class GeneratedTestFromBip39Seed_Signing {

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
    public void testFromBip39Seed_Signing() throws SignatureException, IOException {
        verify(pair.fromBip39Seed("bip39_seed", "1234567890abcdef"), times(1));
        mockEdDSAPublicKey = new MockEdDSAPublicKey();
        when(eddsaEngine.getAlgorithm()).thenReturn(mockEdDSAPublicKey.getAlgorithm());
        pair.sign("secret_seed");
    }

    public void setup() {
    }

}