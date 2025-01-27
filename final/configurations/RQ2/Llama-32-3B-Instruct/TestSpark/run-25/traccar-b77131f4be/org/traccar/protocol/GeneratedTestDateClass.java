package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.MockitoJUnitRunner;

public class GeneratedTestDateClass {

    @Test
    public void testDateClass() {
        // class creation
        public class Date {
            private int value;

            public Date(int value) {
                this.value = value;
            }

            public String toString() {
                return Integer.toString(this.value);
            }
        }

        Date date = new Date(0);

        assertEquals(date.toString(), "0", 0);
    }

}