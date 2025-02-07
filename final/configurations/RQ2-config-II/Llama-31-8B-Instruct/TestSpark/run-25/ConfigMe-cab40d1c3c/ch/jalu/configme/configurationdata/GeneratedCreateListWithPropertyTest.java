package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateListWithPropertyTest {

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    @Test
    public void createListWithPropertyTest() {
        Property<String> property = mock(Property.class);
        propertyListBuilder.add(property);
        List<Property<?>> properties = propertyListBuilder.create();
        assertNotNull(properties);
        assertEquals(1, properties.size());
        verify(property, times(1)).setParent(any());
    }

}