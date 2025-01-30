package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Command;

import static org.junit.Assert.assertNotNull;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        verifyNotNull(decoder, binary(
                "[3G*123456789012345*0252*UD,140111,023058,A,23.554858,N,113.653872,E,0.00,0,20,0,0,0,1010100000000100,0,214,03,374,0986,0093,1306,13935,0032,374,0988,0033,7,YYLMZDM1,58,1618532903090E,34NP,30F+0LFZ9AM,68,1618532903090E,62NP,3291lEWaN+1,66,1618532903090E,58NP,-21,8yrZzJRTZ,64,1618532903090E,64NP,-42,LajgBwnsQ,64,1618532903090E,-8NP,320aTh/Hr9E,64,1618532903090E,-44NP,-128,BUGrb8Ry,64,1618532904090E,-44NP]"));
        verifyNotNull(decoder, binary(
                "[3G*123456789012345*0002*LK,104090,30,100,1,0]"));
    }

}