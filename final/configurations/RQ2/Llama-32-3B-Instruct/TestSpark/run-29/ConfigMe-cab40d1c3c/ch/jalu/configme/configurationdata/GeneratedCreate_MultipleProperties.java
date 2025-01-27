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
public class GeneratedCreate_MultipleProperties {

    @Mock
    private List<Property<?>> propertyList;

    @Test
    public void create_MultipleProperties() {
        // Arrange
        Property<?> property1 = mock(Property.class);
        Property<?> property2 = mock(Property.class);

        when(property1.getClass()).thenReturn(null);
        when(property2.getClass()).thenReturn(null);

        // Act
        List<Property<?>> result = new PropertyListBuilder().add(property1).add(property2).create();

        // Assert
        assertEquals(2, result.size());
    }

}