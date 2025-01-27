package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestKeyPairCanSign {

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
    public void testKeyPairCanSign() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new byte[32]));
        assertTrue(keyPair.canSign());
    }

}