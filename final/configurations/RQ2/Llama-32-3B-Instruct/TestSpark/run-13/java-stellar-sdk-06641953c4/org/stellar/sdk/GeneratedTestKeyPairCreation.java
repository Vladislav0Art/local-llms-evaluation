package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestKeyPairCreation {

    private Object decodedValue;

    public void setDecodedValue(Object value) {
        this.decodedValue = value;
    }

    public Object getDecodedValue() {
        return decodedValue;
    }
}

// Mock.class
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Random;

public class Mock {

    @Test
    public void testKeyPairCreation() {
        EdDSADecoderMock decoderMock = new EdDSADecoderMock();
        byte[] decodedValue = "bip39 seed".getBytes();
        decoderMock.setDecodedValue(decodedValue);
        KeyPair keyPair = KeyPair.fromSecretSeed("bip39 seed", 0);
        assertEquals(decodedValue, keyPair.getPublicKey().getEncoded());
    }

}