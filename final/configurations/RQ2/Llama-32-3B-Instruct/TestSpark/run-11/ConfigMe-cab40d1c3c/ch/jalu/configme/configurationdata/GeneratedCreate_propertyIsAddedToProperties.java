package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_propertyIsAddedToProperties {

    @Mock
    private List<Property<?>> properties;

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    public PropertyListBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void create_propertyIsAddedToProperties() throws Exception {
        // Arrange
        List<Property<?>> expected = new ArrayList<>();
        Property<?> property = mock(Property.class);
        when(property.getClass()).thenReturn(Property.class);
        doReturn(expected).when(properties).addAll(anyList());

        // Act
        List<Property<?>> result = propertyListBuilder.create();

        // Assert
        verify(properties).addAll(result);
    }

}