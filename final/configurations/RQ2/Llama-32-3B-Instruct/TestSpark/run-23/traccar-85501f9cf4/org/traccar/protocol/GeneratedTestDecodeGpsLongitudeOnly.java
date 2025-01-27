package org.traccar.protocol;

public class GeneratedTestDecodeGpsLongitudeOnly {

    private double latitude;
    private double longitude;

    public void setPosition(byte[] buf) {
        if (buf.length < 10) {
            throw new RuntimeException();
        }
        System.arraycopy(buf, 0, this.latitude = new Double(readByte(buf)), 0, 8);
        System.arraycopy(buf, 8, this.longitude = new Double(readByte(buf)), 0, 8);
    }

    private byte readByte(byte[] buf) {
        return buf[buf.length - 1];
    }

    public double getValue() {
        return latitude;
    }
}

public class Gt06ProtocolDecoderTest {

    @Test
    public void testDecodeGpsLongitudeOnly() {
        GpssPosition position = new GpssPosition();
        byte[] buf = new byte[10];
        buf[0] = 1; // Set the initial value of longitude to 1
        position.setPosition(buf);
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, Calendar.getInstance()));
    }

}