package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedNew_instance test {

    @Test
    public void new_instance

    test() {
        assertTrue(Gt06ProtocolDecoder.class.isInstance(Gt06ProtocolDecoder.newInstance()));
    }

    private static class SingletonHolder {
        public static final Gt06ProtocolDecoder INSTANCE = new Gt06ProtocolDecoder();
    }

    private static Gt06ProtocolDecoder INSTANCE = null;

    public static Gt06ProtocolDecoder newInstance() {
        if (INSTANCE == null) {
            synchronized (Gt06ProtocolDecoder.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Gt06ProtocolDecoder();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        // Implementation
        return super.decode(channel, remoteAddress, msg);
    }

}