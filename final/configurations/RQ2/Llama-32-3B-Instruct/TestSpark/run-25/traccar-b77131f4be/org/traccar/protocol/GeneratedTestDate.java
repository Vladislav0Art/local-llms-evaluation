package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.Date;
import org.traccar.helper.Calendar;

public class GeneratedTestDate {

    @Test
    public void testDate() {
        // variable initialization
        Date date = new Date(0);

        // method call
        assertEquals(date.getTime(), 0L, 0);
    }

}