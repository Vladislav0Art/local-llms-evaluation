package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void addPropertyTest() {
        Property<String> property = Property.create("DataSource.mysql", String.class);
        propertyListBuilder.add(property);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertEquals(property, rootEntries.get("DataSource.mysql"));
    }

    @Test
    public void createReturnsEmptyListIfNoPropertiesAddedTest() {
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(0, properties.size());
    }

    @Test
    public void createReturnsListWithAddedPropertyTest() {
        Property<String> property = Property.create("DataSource.mysql", String.class);
        propertyListBuilder.add(property);

        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}