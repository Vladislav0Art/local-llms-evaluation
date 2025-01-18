package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class GeneratedAddValidPropertyTest {

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> mockProperty = Mockito.mock(Property.class);

        try {
            builder.add(mockProperty);
            List<Property<?>> properties = builder.create();
            assertNotNull(properties);
            assertEquals(1, properties.size());
            assertEquals(mockProperty, properties.get(0));
        } catch (Exception e) {
            fail("No exception should have been thrown");
        }
    }

}