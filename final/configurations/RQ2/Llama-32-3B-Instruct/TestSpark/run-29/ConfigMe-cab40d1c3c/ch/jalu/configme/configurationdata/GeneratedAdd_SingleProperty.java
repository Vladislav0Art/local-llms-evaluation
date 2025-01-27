package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAdd_SingleProperty {

    @Mock
    private List<Property<?>> propertyList;

    @Test
    public void add_SingleProperty() {
        // Arrange
        Property<?> property = mock(Property.class);
        when(property.getClass()).thenReturn(null);

        // Act
        List<Property<?>> result = new PropertyListBuilder().add(property).create();

        // Assert
        assertEquals(1, result.size());
    }

}