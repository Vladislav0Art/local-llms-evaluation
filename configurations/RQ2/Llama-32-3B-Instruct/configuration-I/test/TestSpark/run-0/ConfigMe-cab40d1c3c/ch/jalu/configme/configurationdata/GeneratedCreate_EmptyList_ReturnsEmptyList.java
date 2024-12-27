package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_EmptyList_ReturnsEmptyList {

    @Test
    public void create_EmptyList_ReturnsEmptyList() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();

        // Act
        Map<String, Object> map = PropertyListBuilder.builder(properties).create();

        // Assert
        assertEquals(0, ((List<?>) map.get("properties")).size());
    }

}