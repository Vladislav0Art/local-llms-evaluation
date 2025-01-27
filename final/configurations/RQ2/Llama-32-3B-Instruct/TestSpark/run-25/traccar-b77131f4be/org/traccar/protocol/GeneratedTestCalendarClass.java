package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.MockitoJUnitRunner;

public class GeneratedTestCalendarClass {

    @Test
    public void testCalendarClass() {
        // class creation
        public class Calendar {
            private int value;

            public Calendar(int value) {
                this.value = value;
            }

            public String toString() {
                return Integer.toString(this.value);
            }
        }

        Calendar calendar = new Calendar(0);

        assertEquals(calendar.toString(), "0", 0);
    }
}

}