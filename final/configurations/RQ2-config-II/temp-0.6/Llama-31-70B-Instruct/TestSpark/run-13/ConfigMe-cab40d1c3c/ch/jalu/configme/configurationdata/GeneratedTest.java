package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.properties.Property;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testAdd() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Property<?> property = Mockito.mock(Property.class);

        propertyListBuilder.add(property);

        assertEquals(property, propertyListBuilder.getRootEntries().get(property.getPath()));
    }

}