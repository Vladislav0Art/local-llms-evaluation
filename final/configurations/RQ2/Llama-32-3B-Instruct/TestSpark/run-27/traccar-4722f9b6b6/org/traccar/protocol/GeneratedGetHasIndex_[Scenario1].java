package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;

import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex_[Scenario1]{

@Mock
private NetworkMessage message;

@Mock
private Channel channel;

@Test
public void getHasIndex_[
Scenario1](){
WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

assertTrue(decoder.getHasIndex());
        }

        }