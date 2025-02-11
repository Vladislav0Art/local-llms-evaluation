package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAsTypedMap_InvalidType_ThrowsException {

    @Test
    public void asTypedMap_InvalidType_ThrowsException() {
        Object o = 123;
        try {
            PropertyListBuilder.asTypedMap(o);
            fail("Expected ConfigMeException to be thrown");
        } catch (ConfigMeException e) {
            assertEquals("Value of unknown type found at '': " + o, e.getMessage());
        }
    }

}