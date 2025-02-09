package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCreateAfterAddingPropertyTest {

    @Test
    public void createAfterAddingPropertyTest() {
        Property<?> mockProperty = mock(Property.class);

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(mockProperty);

        List<Property<?>> result = builder.create();
        assertTrue(result.contains(mockProperty));
        assertEquals(1, result.size());
    }

}