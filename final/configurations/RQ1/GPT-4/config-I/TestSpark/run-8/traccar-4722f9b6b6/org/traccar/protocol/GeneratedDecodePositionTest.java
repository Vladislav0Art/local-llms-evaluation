package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import io.netty.channel.Channel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePositionTest {

    private WatchProtocolDecoder decoder;
    private Position position;

    @Before
    public void init() {
        Protocol protocol = new Protocol("watch") {
        };
        decoder = new WatchProtocolDecoder(protocol);
        position = new Position();
        position.setProtocol("watch");
    }

    @Test
    public void decodePositionTest() {
        Assert.assertThat(decoder.decodePosition(null, "200218,225800,A,-6.173640,N,106.641862,E,0.00,0.0,0.0,6,4,2,122,x10,"), is(notNullValue()));
        Assert.assertThat(decoder.decodePosition(null, "200218,225800,A,-6.173640,N,106.641862,E,0.00,0.0,0.0,6,4,2,122,x10,;"), is(notNullValue()));
        Assert.assertThat(decoder.decodePosition(null, "200218,225800,A,-6.173640,N,106.641862,E,0.00,0.0,0.0,6,4,2,122,x10,1,1;"), is(notNullValue()));
        Assert.assertThat(decoder.decodePosition(null, "200218,225800,A,-6.173640,N,106.641862,E,0.00,0.0,0.0,6,4,2,122,x10,2,2,510,10,57987,15775,111;"), is(notNullValue()));
    }

}