package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestKeyPairFromCorrectSeed {

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
    public void testKeyPairFromCorrectSeed() {
        EdDSADecoderMock decoderMock = new EdDSADecoderMock();
        byte[] decodedValue = "account_id".getBytes();
        decoderMock.setDecodedValue(decodedValue);
        KeyPair keyPair = KeyPair.fromSecretSeed("account_id", 1);
        assertNotNull(keyPair.getPublicKey());
    }

}