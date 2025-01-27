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
public class GeneratedAdd_EmptyPropertyList {

    @Mock
    private List<Property<?>> propertyList;

    @Test
    public void add_EmptyPropertyList() {
        // Arrange
        when(propertyList.isEmpty()).thenReturn(true);

        // Act
        new PropertyListBuilder().add(null).create();

        // Assert
        verify(propertyList, times(1)).isEmpty();
    }

}