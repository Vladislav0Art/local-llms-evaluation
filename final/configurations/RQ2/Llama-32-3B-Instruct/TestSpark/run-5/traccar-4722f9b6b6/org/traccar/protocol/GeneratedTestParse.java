package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestParse {

    public DeviceSession deviceSession() {
        return new DeviceSession(); // make it public
    }

    @Test
    public void testParse() {
        String string = "test";
        Pattern pattern = this.parse(string);
        assertEquals(Pattern.class, pattern.getClass());
    }
}
		
		import org.junit.Test;
		import org.junit.runner.RunWith;
		
		import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Position {

    public int value() {
        return 0; // make it public
    }

}