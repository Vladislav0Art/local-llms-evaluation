package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedAddPropertyTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void addPropertyTest() {
        Property<String> property = Property.create("DataSource.mysql", String.class);
        propertyListBuilder.add(property);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertEquals(property, rootEntries.get("DataSource.mysql"));
    }

}