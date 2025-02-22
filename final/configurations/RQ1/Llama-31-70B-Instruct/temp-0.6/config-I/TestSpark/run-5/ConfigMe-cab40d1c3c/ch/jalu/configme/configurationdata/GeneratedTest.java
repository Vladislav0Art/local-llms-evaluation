package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addProperty_validProperty_addsPropertyToList() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = mock(Property.class);
        String path = "DataSource.mysql";
        when(property.getPath()).thenReturn(path);
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        propertyListBuilder.getRootEntries().put("DataSource", rootEntries);

        // When
        propertyListBuilder.add(property);

        // Then
        assertEquals(1, propertyListBuilder.getRootEntries().size());
        assertEquals(1, ((Map<String, Object>) propertyListBuilder.getRootEntries().get("DataSource")).size());
        assertEquals(property, ((Map<String, Object>) propertyListBuilder.getRootEntries().get("DataSource")).get("mysql"));
    }

}