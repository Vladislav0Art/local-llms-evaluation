package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

public class GeneratedGetManufacturer_ReturnsManufacturer {

    private String manufacturer;

    public WatchProtocolDecoder(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean getHasIndex() {
        return false;
    }

    public void setHasIndex(boolean hasIndex) {
        // implementation
    }

    public NetworkMessage decode(int protocol, String host, Object... args) {
        // implementation
        return null;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert .*;
        import java.nio.charset.StandardCharsets;
import java.util.Date;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

public class WatchProtocolDecoderTest {

    @Test
    public void getManufacturer_ReturnsManufacturer() {
        WatchProtocolDecoder instance = new WatchProtocolDecoder("Manufacturer");
        assertEquals(instance.getManufacturer(), "Manufacturer");
    }

}