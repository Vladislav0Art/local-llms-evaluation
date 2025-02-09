package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSign_returnsCorrectSignature {

    @Mock
    private EdDSAPrivateKey edDsaprivateKey;

    @Mock
    private EdDSAEngine edDsaEngine;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(edDsaEngine.getEdDspRng()).thenReturn(new byte[]{1, 2, 3});
    }

    @Test
    public void sign_returnsCorrectSignature() throws IOException, GeneralSecurityException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(bos);
        Uint256 uint256 = new Uint256(1234567890L);
        when(edDsaEngine.getEdDspRng()).thenReturn(new byte[]{1, 2, 3});
        Signature signature = keyPair.sign(uint256.getBytes());
        assertEquals(signature, DecoratedSignature.create(xdrDataOutputStream, signature));
    }

}