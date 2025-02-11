package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.put;
import static org.mockito.Mockito.verify;

public class GeneratedTestPropertyListBuilder {

    @Mock
    private RootEntries rootEntries;

    @Test
    public void testPropertyListBuilder() {
        // Arrange
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder(rootEntries);

        // Act
        List<Property<?>> result = propertyListBuilder.create();

        // Assert
        verify(rootEntries, times(1)).put(anyString(), anyObject());
    }

}