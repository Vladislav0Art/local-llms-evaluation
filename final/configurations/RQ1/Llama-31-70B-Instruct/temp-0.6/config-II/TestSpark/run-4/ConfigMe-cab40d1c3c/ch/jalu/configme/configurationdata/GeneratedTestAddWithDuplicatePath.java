package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import ch.jalu.configme.properties.Property;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestAddWithDuplicatePath {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @AfterEach
    public void tearDown() {
        propertyListBuilder = null;
    }

    @Test
    public void testAddWithDuplicatePath() {
        Property property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property1);

        Property property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("DataSource.mysql");

        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property2));
    }

}