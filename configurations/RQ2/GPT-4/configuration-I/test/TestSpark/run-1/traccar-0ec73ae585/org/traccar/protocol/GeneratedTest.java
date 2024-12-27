package org.traccar.protocol;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.BaseProtocol;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

import org.traccar.protocol.Protocol;

import java.io.ObjectDecoderOutputStream;

import org.traccar.ProtocolDecoder;
import org.traccar.model.TransportType;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.helper.DateBuilder;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.nio.ByteOrder;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import io.netty.channel.Channel;

public class GeneratedTest {

}