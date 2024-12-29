package org.traccar.protocol;

public class GeneratedTestProtocolConstructor {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Position {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class BitBuffer {
    private byte[] buffer;

    public BitBuffer(int size) {
        buffer = new byte[size];
    }

    public byte getBit(int index) {
        return buffer[index];
    }

    public void setBit(int index, boolean value) {
        if (value) {
            buffer[index] = 1;
        } else {
            buffer[index] = 0;
        }
    }
}

public class TestProtocol {

    @Test
    public void testProtocolConstructor() {
        Protocol protocol = new Protocol();
        assertEquals(0, protocol.getId());
    }

}