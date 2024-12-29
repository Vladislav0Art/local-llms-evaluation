package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        try {
            propertyListBuilder.add(mockProperty);
            List<Property<?>> list = propertyListBuilder.create();
            assertTrue(list.contains(mockProperty));
        } catch (Exception e) {
            assertTrue(false);   // If this line is reached, there is a runtime error in our test
        }
    }

}