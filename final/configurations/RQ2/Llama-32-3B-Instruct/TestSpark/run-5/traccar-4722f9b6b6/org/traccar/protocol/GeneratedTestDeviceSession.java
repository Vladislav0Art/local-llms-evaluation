package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDeviceSession {

    public DeviceSession deviceSession() {
        return new DeviceSession(); // make it public
    }

    @Test
    public void testDeviceSession() {
        DeviceSession deviceSession = this.deviceSession();
        assertEquals(DeviceSession.class, deviceSession.getClass());
    }

    public Channel channel() {
        return new Channel(); // make it public
    }

}