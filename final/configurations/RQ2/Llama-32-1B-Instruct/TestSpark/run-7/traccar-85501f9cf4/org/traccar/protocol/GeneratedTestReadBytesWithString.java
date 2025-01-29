package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestReadBytesWithString {

    public byte[] toByteBuf(String data) {
        return data.getBytes();
    }

    public static String fromByteBuf(byte[] buf) {
        return new String(buf);
    }

    public InputStream getResourceAsStream(String resourceName) throws Exception {
        return TestUtils.class.getResource(resourceName).getAsInputStream();
    }

    public int readBytes(InputStream inputStream, byte[] buf, int offset, int length) throws Exception {
        int bytesRead;
        while ((bytesRead = inputStream.read(buf, offset, length)) != -1) {
            System.arraycopy(buf, offset, buf, offset + bytesRead, bytesRead);
            if (bytesRead == 0) break;
        }
        return bytesRead;
    }

    public String readString(InputStream inputStream) throws Exception {
        byte[] bytes = new byte[100];
        int bytesRead = readBytes(inputStream, bytes, 0, bytes.length);
        return fromByteBuf(bytes, 0, bytesRead);
    }
}

class ProtocolTest {

    @Test
    public void testReadBytesWithString() throws Exception {
        TestUtils.Protocol protocol = new TestUtils.Protocol();
        String data = "1234567890";
        byte[] buf = TestUtils.toByteBuf(data);
        InputStream inputStream = TestUtils.TestUtils.getResourceAsStream("example.txt");
        int bytesRead = TestUtils.readBytes(inputStream, buf, 0, buf.length);
        assertEquals(10, bytesRead);
    }

}