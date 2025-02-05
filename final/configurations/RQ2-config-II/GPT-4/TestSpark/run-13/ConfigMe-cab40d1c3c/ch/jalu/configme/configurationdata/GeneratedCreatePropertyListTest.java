package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = Mockito.mock(Property.class);
        Mockito.when(property1.getPath()).thenReturn("root.key1");
        Property<String> property2 = Mockito.mock(Property.class);
        Mockito.when(property2.getPath()).thenReturn("root.key2");

        // Add properties
        builder.add(property1);
        builder.add(property2);

        // Create Property List
        List<Property<?>> propertyList = builder.create();

        // Verify
        assertEquals(2, propertyList.size());
        assertTrue(propertyList.contains(property1));
        assertTrue(propertyList.contains(property2));
    }

}