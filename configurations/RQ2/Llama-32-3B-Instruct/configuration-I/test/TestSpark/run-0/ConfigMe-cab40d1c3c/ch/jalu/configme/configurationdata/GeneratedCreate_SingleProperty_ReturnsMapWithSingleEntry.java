package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_SingleProperty_ReturnsMapWithSingleEntry {

    @Mock
    private Property<?> property;

    @Test
    public void create_SingleProperty_ReturnsMapWithSingleEntry() {
        // Arrange
        when(property.getName()).thenReturn("test");

        // Act
        List<Property<?>> properties = new ArrayList<>();
        Map<String, Object> map = PropertyListBuilder.builder(properties).add(property).create();

        // Assert
        assertEquals(1, ((List<?>) map.get("properties")).size());
    }

}