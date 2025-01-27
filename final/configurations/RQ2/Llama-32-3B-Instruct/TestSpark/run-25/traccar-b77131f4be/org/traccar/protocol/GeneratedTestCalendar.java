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

public class GeneratedTestCalendar {

    @Test
    public void testCalendar() {
        // variable initialization and class creation
        Calendar calendar = new Calendar();

        // method call
        int time = calendar.getInstance().getTime();
        assertNotNull(time, 0);
    }

}