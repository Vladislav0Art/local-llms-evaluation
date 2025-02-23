package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCreateReturnsListWithAddedPropertyTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void createReturnsListWithAddedPropertyTest() {
        Property<String> property = Property.create("DataSource.mysql", String.class);
        propertyListBuilder.add(property);

        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}