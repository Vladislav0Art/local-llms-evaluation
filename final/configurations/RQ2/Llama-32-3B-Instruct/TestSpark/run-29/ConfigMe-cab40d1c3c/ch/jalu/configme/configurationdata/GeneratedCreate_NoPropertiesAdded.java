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
public class GeneratedCreate_NoPropertiesAdded {

    @Mock
    private List<Property<?>> propertyList;

    @Test
    public void create_NoPropertiesAdded() {
        // Arrange
        when(propertyList.size()).thenReturn(0);

        // Act
        List<Property<?>> result = new PropertyListBuilder().add(null).create();

        // Assert
        assertEquals(new ArrayList<>(), result);
    }

}