package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCanSignIsFalseIfPublicKeyIsNull {

    @Test
    public void canSignIsFalseIfPublicKeyIsNull() {
        assert (!new KeyPair(null).canSign());
    }

}