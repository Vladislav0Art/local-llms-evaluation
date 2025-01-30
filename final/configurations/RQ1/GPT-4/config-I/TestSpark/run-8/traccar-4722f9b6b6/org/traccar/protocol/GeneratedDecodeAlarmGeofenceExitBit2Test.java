package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.ProtocolDecoder;
import org.traccar.SessionKeys;
import org.traccar.database.IdentityManager;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmGeofenceExitBit2Test {

    private ProtocolDecoder decoder;

    private ProtocolDecoder createDecoder() {
        Protocol protocol = new Protocol("watch") {
            @Override
            public String getUniqueIdPrefix() {
                return "watch";
            }
        };

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        IdentityManager identityManager = mock(IdentityManager.class);
        when(identityManager.getByUniqueId("123456789012345")).thenReturn(null);
        when(identityManager.getByUniqueId("watch123456789012345")).thenReturn(null);

        Channel channel = mock(Channel.class);
        when(channel.attr(SessionKeys.IDENTITY_MANAGER)).thenReturn(new Attribute<>(identityManager));

        return decoder;
    }

    @Test
    public void decodeAlarmGeofenceExitBit2Test() {
        decoder = createDecoder();
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(262144));
    }

}