package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNullDecodedValue {

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
    public void testNullDecodedValue() {
        EdDSADecoderMock decoderMock = new EdDSADecoderMock();
        Mockito.when(decoderMock.getDecodedValue()).thenReturn(null);
        try {
            KeyPair.fromSecretSeed("account_id", 1);
            assert false;
        } catch (NullPointerException e) {
            // Expected
        }
    }

}