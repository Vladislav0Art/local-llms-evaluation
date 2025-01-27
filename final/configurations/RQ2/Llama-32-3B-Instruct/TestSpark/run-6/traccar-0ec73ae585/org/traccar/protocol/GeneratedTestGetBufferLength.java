package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetBufferLength {

    @Test
    public void testGetBufferLength() {
        int buffer = 100;
        assertEquals(100, UnitUtils.getBufferLength(buffer));
    }

    public class BitUtil {

        public static boolean isBitSet(int value, int bit) {
            return (value & (1 << bit)) != 0;
        }
    }

}