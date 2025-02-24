package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() throws Exception {
        // Given
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

        // When
        boolean hasIndex = watchProtocolDecoder.getHasIndex();

        // Then
        assertEquals(true, hasIndex);
    }

}