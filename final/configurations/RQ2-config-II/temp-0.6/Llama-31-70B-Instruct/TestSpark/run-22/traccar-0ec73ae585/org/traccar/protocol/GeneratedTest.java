package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Command;
import org.traccar.model.DeviceSession;
import org.traccar.model.NetworkMessage;
import org.traccar.model.Position;
import org.traccar.session.Channel;

import java.net.SocketAddress;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private static final String DECODER_ID = "test_decoder";

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(DECODER_ID));

    @Test
    public void testHasIndex() {
        assertEquals(false, decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        assertNotNull(decoder.getManufacturer());
    }

    @Test
    public void testDecode() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        when(channel.getDeviceSession(remoteAddress)).thenReturn(mock(DeviceSession.class));

        Object response = decoder.decode(channel, remoteAddress, msg);

        assertNotNull(response);
    }

    @Test
    public void testCommand() {
        Command command = new Command(Command.Type.CUSTOM);
        command.setString(Command.KEY_DATA, "test_command");

        NetworkMessage response = decoder.command(command);

        assertNotNull(response);
    }

}