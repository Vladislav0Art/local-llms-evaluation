package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestChannel {

    public DeviceSession deviceSession() {
        return new DeviceSession(); // make it public
    }

    @Test
    public void testChannel() {
        Channel channel = this.channel();
        assertEquals(Channel.class, channel.getClass());
    }
}
		
		import org.junit.Test;
		import org.junit.runner.RunWith;
		
		import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BufferUtil {

    public static byte[] encode(Network network, Date date) {
        return new byte[0]; // make it public
    }

}