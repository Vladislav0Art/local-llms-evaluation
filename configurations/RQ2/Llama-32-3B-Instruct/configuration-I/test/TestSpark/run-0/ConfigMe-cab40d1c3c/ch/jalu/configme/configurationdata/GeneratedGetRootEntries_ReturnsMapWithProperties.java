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
public class GeneratedGetRootEntries_ReturnsMapWithProperties {

    @Mock
    private Property<?> property;

    @Test
    public void getRootEntries_ReturnsMapWithProperties() {
        // Arrange
        when(property.getName()).thenReturn("test");

        // Act
        List<Property<?>> properties = new ArrayList<>();
        Map<String, Object> map = PropertyListBuilder.builder(properties).add(property).create();

        // Assert
        assertTrue(map.containsKey("properties"));
    }

}