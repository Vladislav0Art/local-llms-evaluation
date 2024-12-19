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

public class GeneratedTest {

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

    @Test
    public void decodeGpsPositionMultipleBytesTest() {
        Position(position = POSITION, buf = BUF, hasLength = false, hasSatellites = false, hasSpeed = false, timezone = TIMEZONE) throws
        Exception;
        verify(position).decode(MESSAGE.getBytes(), BUF, true, false, false, TIMEZONE);
    }

    @Test
    public void decodeGpsPositionNoBytesTest() {
        Position position = new Position(42.1234L);
        assertNotEquals(position, POSITION);
        Position decodedPosition = ((Gt06ProtocolDecoder) this).decode(Position.class, BUF, true, false, false, TIMEZONE);
        assertEquals(decodedPosition, position);
    }

    @Test
    public void decodeGpsNoMessageLengthTest() {
        Position(position = POSITION, buf = mock(ByteBuf.class), hasLength = false, hasSatellites = false, hasSpeed = false, timezone = TIMEZONE) throws
        Exception;
        verify(POSITION).decode(Mockito.anyPosition(), MOCKED_BUF, true, false, false, TIMEZONE);
    }

    @Test
    public void decodeGpsNoMessageTest() {
        Position(position = POSITION, buf = mock(ByteBuf.class), hasLength = false, hasSatellites = false, hasSpeed = false, timezone = TIMEZONE) throws
        Exception;
        verify(POSITION).decode(Mockito.anyPosition(), MOCKED_BUF, false, false, false, TIMEZONE);
    }

    @Test
    public void decodeGpsNoSatellitesTest() {
        Position(position = POSITION, buf = mock(ByteBuf.class), hasLength = true, hasSatellites = false, hasSpeed = false, timezone = TIMEZONE) throws
        Exception;
        verify(POSITION).decode(Mockito.anyPosition(), MOCKED_BUF, true, MOCKED_HAS_SATELLITES, false, TIMEZONE);
    }

    @Test
    public void decodeGpsNoSpeedTest() {
        Position(position = POSITION, buf = mock(ByteBuf.class), hasLength = true, hasSatellites = true, hasSpeed = false, timezone = TIMEZONE) throws
        Exception;
        verify(POSITION).decode(Mockito.anyPosition(), MOCKED_BUF, true, true, MOCKED_HAS_SPEED, TIMEZONE);
    }

    @Test
    public void decodeGpsNoTimezoneTest() {
        Position(position = POSITION, buf = mock(ByteBuf.class), hasLength = false, hasSatellites = false, hasSpeed = false, timezone = null) throws
        Exception;
        verify(POSITION).decode(Mockito.anyPosition(), MOCKED_BUF, true, false, false, TIMEZONE);
    }

    @Test
    public void decodeGpsPositionMockedMockedPosition() throws Exception {
        gT06ProtocolDecoder.decode(Position.class, MOCKED_BUF, true, false, false, mockedTimeZone);
        verify(mockedPosition).decode(MESSAGE.getBytes(), BUF, true, false, false, mockedTimeZone);
    }

    @Test
    public void decodeGpsPositionMockedMockedTimeZone() throws Exception {
        gT06ProtocolDecoder.decode(Position.class, MOCKED_BUF, true, false, false, mockedTimeZone);
        verify(mockedPosition).decode(MESSAGE.getBytes(), BUF, true, false, false, mockedTimeZone);
    }

    @Test
    public void decodeGpsNoMockedMockedPosition() throws Exception {
        gT06ProtocolDecoder.decode(Position.class, MOCKED_BUF, true, false, false, null);
        verify(mockedPosition).decode(MESSAGE.getBytes(), BUF, true, false, false, mockedTimeZone);
    }

    @Test
    public void decodeGpsNoMockedMockedTimeZone() throws Exception {
        gT06ProtocolDecoder.decode(Position.class, MOCKED_BUF, true, false, false, null);
        verify(mockedPosition).decode(MESSAGE.getBytes(), BUF, true, false, false, mockedTimeZone);
    }

}