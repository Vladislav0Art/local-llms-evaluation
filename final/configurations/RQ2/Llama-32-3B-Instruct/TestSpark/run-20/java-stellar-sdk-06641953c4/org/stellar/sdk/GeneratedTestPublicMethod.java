package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class GeneratedTestPublicMethod {

    @Mock
    private DecoratedSignature decoratedSignature;

    public boolean publicMethod() {
        return decoratedSignature.sign("data");
    }

    @Test
    public void testPublicMethod() {
        // Arrange
        when(decoratedSignature.sign(any())).thenReturn(true);

        // Act and Assert
        boolean result = publicMethod();
        assertEquals(true, result);
    }
}

public class PublicClass {

    private DecoratedSignature decoratedSignature;

    public PublicClass() {
        this.decoratedSignature = new DecoratedSignature();
    }

    public boolean sign(String data) {
        return decoratedSignature.sign(data);
    }
}

}