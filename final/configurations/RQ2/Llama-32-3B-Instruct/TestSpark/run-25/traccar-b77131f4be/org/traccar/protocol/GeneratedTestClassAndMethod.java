package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.MockitoJUnitRunner;

public class GeneratedTestClassAndMethod {

    @Test
    public void testClassAndMethod() {
        // class creation
        public class MyPosition extends Position {
            private int x;
            private int y;

            public MyPosition(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int getX() {
                return this.x;
            }
        }

        MyPosition position = new MyPosition(0, 0);

        assertEquals(position.getX(), 0, 0);
    }

}