package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Command;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void decodePositionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        verifyNotNull(decoder, binary(
                "[3G*123456789012345*0252*UD,140111,023058,A,23.554858,N,113.653872,E,0.00,0,20,0,0,0,1010100000000100,0,214,03,374,0986,0093,1306,13935,0032,374,0988,0033,7,YYLMZDM1,58,1618532903090E,34NP,30F+0LFZ9AM,68,1618532903090E,62NP,3291lEWaN+1,66,1618532903090E,58NP,-21,8yrZzJRTZ,64,1618532903090E,64NP,-42,LajgBwnsQ,64,1618532903090E,-8NP,320aTh/Hr9E,64,1618532903090E,-44NP,-128,BUGrb8Ry,64,1618532904090E,-44NP]"));
        verifyNotNull(decoder, binary(
                "[3G*123456789012345*0002*LK,104090,30,100,1,0]"));
    }

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        assertNotNull(decoder.decodeAlarm(1));
        assertNotNull(decoder.decodeAlarm(2));
        assertNotNull(decoder.decodeAlarm(14));
        assertNotNull(decoder.decodeAlarm(16));
        assertNotNull(decoder.decodeAlarm(17));
        assertNotNull(decoder.decodeAlarm(18));
        assertNotNull(decoder.decodeAlarm(19));
        assertNotNull(decoder.decodeAlarm(20));
        assertNotNull(decoder.decodeAlarm(21));
    }

    @Test
    public void decodeInitTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        ChannelBuffer buffer = ChannelBuffers.copiedBuffer("[3G*123456789012345*0002*INIT]", StandardCharsets.US_ASCII);
        Channel channel = new TestIdentityManager.MockChannel(true);

        assertNotNull(decoder.decode(channel, null, buffer));
    }

    @Test
    public void decodeTkqTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        ChannelBuffer buffer = ChannelBuffers.copiedBuffer("[3G*123456789012345*0002*TKQ]", StandardCharsets.US_ASCII);
        Channel channel = new TestIdentityManager.MockChannel(true);

        assertNotNull(decoder.decode(channel, null, buffer));
    }

    @Test
    public void decodeHeartTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        ChannelBuffer buffer = ChannelBuffers.copiedBuffer("[3G*123456789012345*0002*HEART]", StandardCharsets.US_ASCII);
        Channel channel = new TestIdentityManager.MockChannel(true);

        assertNotNull(decoder.decode(channel, null, buffer));
    }

    @Test
    public void decodeImgTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        ChannelBuffer buffer = ChannelBuffers.copiedBuffer("[3G*123456789012345*0002*img]", StandardCharsets.US_ASCII);
        Channel channel = new TestIdentityManager.MockChannel(true);

        assertNotNull(decoder.decode(channel, null, buffer));
    }

    @Test
    public void decodeJxTkTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        ChannelBuffer buffer = ChannelBuffers.copiedBuffer("[3G*123456789012345*0002*JXTK]", StandardCharsets.US_ASCII);
        Channel channel = new TestIdentityManager.MockChannel(true);

        assertNotNull(decoder.decode(channel, null, buffer));
    }

    @Test
    public void decodeTkTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        ChannelBuffer buffer = ChannelBuffers.copiedBuffer("[3G*123456789012345*0002*TK]", StandardCharsets.US_ASCII);
        Channel channel = new TestIdentityManager.MockChannel(true);

        assertNotNull(decoder.decode(channel, null, buffer));
    }

}