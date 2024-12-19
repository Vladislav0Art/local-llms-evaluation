package org.traccar.protocol;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedDecodeGpsPositionTest {

    private static final String MESSAGE = "Hello, world!";
    private static final ByteBuf BUF = ByteBuffer.wrap(MESSAGE.getBytes());
    private static final Position POSITION = new Position(42.1234L);
    private static final TimeZone TIMEZONE = TimeZone.getTimeZone("GMT");

    @BeforeEach
    public void setup() {
        // No setup needed in this case, as we're using mock objects
    }

    @AfterAll
    public void teardown() {
        // No teardown needed in this case, as we're not using mock objects
    }

    @Test
    public void decodeGpsPositionTest() {
        Position(position = POSITION, buf = BUF, hasLength = false, hasSatellites = false, hasSpeed = false, timezone = TIMEZONE) throws
        Exception;
        verify(position).decode(MESSAGE.getBytes(), BUF, true, false, false, TIMEZONE);
    }

}