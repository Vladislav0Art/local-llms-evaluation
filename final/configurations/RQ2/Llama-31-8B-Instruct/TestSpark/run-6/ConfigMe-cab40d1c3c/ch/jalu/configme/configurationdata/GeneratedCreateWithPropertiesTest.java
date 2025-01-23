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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateWithPropertiesTest {

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    @Test
    public void createWithPropertiesTest() {
        Property<String> property1 = mock(Property.class);
        Property<String> property2 = mock(Property.class);
        when(property1.getParent()).thenReturn(propertyListBuilder);
        when(property2.getParent()).thenReturn(propertyListBuilder);
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(2, properties.size());
        verify(property1).setParent(any());
        verify(property2).setParent(any());
    }

}