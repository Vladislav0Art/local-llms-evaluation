package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> mockProperty = Mockito.mock(Property.class);
        when(mockProperty.getPath()).thenReturn("DataSource.mysql.user");

        // Act
        builder.add(mockProperty);

        // Assert
        assertEquals("DataSource.mysql.user", builder.getRootEntries().get("DataSource").toString());
    }

}