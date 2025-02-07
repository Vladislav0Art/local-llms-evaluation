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
public class GeneratedCreateListWithPropertiesTest {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void createListWithPropertiesTest() {
        // Arrange
        Property<String> property1 = mock(Property.class);
        Property<Integer> property2 = mock(Property.class);
        // Act
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        // Assert
        assertEquals(2, result.size());
        verify(property1, times(1)).addToList(builder);
        verify(property2, times(1)).addToList(builder);
    }

}