package org.traccar.protocol;

public class GeneratedTest {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class BitBuffer {
    private byte[] buffer;

    public BitBuffer(byte[] buffer) {
        this.buffer = buffer;
    }

    public boolean getBit(int i) {
        return (buffer[i / 8] & (1 << (i % 8))) != 0;
    }

    public int getBitCount() {
        int count = 0;
        for (int i = 0; i < buffer.length * 8; i++) {
            if ((buffer[i / 8] & (1 << (i % 8))) != 0) {
                count++;
            }
        }
        return count;
    }

    public boolean isSet(int bitNumber) {
        int index = bitNumber / 8;
        int bitPosition = bitNumber % 8;
        if (index >= buffer.length || bitPosition < 0) {
            return false;
        }
        return (buffer[index] & (1 << bitPosition)) != 0;
    }

    public static class BitBufferTest {

    }