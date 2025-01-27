package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestChannel {

    @Test
    public void testChannel() {
        Position position = new Position(0, 0);
        Channel channel = new Channel(position);

        assertEquals(0, channel.getProtocolId());
        assertEquals(position, channel.getPosition());

        Mockito.when(channel.getPosition()).thenReturn(new Position(1, 1));
        assertEquals(new Position(1, 1), channel.getPosition());
    }

    public class UnitUtils {

        public static int getBufferLength(int buffer) {
            return buffer;
        }
    }

}