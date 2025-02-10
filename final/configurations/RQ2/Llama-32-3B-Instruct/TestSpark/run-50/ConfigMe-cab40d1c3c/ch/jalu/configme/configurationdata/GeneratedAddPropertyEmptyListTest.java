package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GeneratedAddPropertyEmptyListTest {

    @Test
    public void addPropertyEmptyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertEquals(0, properties.size());
        builder.add(new Property());
        assertNotNull(properties);
        assertTrue(properties.isEmpty());
    }

}