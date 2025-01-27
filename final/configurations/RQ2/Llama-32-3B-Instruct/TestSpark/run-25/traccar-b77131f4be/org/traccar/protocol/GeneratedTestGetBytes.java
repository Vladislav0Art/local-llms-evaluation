package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.MockitoJUnitRunner;

public class GeneratedTestGetBytes {

    @Test
    public void testGetBytes() {
        // class creation
        public class BitBuffer {
            private byte[] bytes;

            public byte[] getBytes() {
                return this.bytes;
            }

            public void setBytes(byte[] bytes) {
                this.bytes = bytes;
            }
        }

        BitBuffer bitBuffer = new BitBuffer();
        bitBuffer.setBytes(new byte[]{1, 2, 3});

        assertNotNull(bitBuffer.getBytes(), 0);
    }

}