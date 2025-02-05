package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

public class GeneratedGetRootEntriesNonEmptyTest {

    @Test
    public void getRootEntriesNonEmptyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> propertyUnderTest = mock(Property.class);
        when(propertyUnderTest.getPath()).thenReturn("test.path");
        when(propertyUnderTest.getDefaultValue()).thenReturn("test.default");
        builder.add(propertyUnderTest);

        // Act
        Map<String, Object> rootEntries = builder.getRootEntries();

        // Assert
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.containsKey("test.path"));
    }

}