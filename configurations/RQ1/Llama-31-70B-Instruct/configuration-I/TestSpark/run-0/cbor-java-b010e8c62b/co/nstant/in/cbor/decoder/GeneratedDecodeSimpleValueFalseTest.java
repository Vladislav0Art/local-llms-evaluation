package co.nstant.in.cbor.decoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import co.nstant.in.cbor.CborDecoder;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.SimpleValue;
import co.nstant.in.cbor.model.SimpleValueType;
import co.nstant.in.cbor.model.Special;
import co.nstant.in.cbor.model.SpecialType;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedDecodeSimpleValueFalseTest {

    @Test
    public void decodeSimpleValueFalseTest() throws CborException {
        // Arrange
        int initialByte = 0xF4;
        CborDecoder decoder = mock(CborDecoder.class);
        InputStream inputStream = new ByteArrayInputStream(new byte[]{initialByte});
        SpecialDecoder specialDecoder = new SpecialDecoder(decoder, inputStream);

        // Act
        Special result = specialDecoder.decode(initialByte);

        // Assert
        assertNotNull(result);
        assertEquals(SimpleValue.FALSE, result);
    }

}