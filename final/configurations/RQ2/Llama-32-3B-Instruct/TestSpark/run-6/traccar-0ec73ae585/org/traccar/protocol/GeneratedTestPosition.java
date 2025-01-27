package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestPosition {

    @Test
    public void testPosition() {
        Position position = new Position(0, 0);
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());
    }

    public class Position {
        private int x;
        private int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

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

    public class Channel {
        private Position position;

        public Channel(Position position) {
            this.position = position;
        }

        public int getProtocolId() {
            return 0;
        }

        public Position getPosition() {
            return position;
        }
    }

}