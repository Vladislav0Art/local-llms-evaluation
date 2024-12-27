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
public class GeneratedCreate_EmptyList_ReturnsEmptyMap {

    @Mock
    private Property<?> property;

    @Test
    public void create_EmptyList_ReturnsEmptyMap() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();

        // Act
        Map<String, Object> map = PropertyListBuilder.builder(properties).create();

        // Assert
        assertTrue(map.isEmpty());
    }

}