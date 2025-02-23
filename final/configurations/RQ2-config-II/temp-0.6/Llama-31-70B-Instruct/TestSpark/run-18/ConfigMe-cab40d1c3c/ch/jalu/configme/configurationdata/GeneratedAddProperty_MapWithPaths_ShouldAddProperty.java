package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddProperty_MapWithPaths_ShouldAddProperty {

    @Mock
    private Property<String> property;

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_MapWithPaths_ShouldAddProperty() {
        when(property.getPath()).thenReturn("path.to.property");
        propertyListBuilder.add(property);

        assertTrue(propertyListBuilder.getRootEntries().containsKey("path"));
        assertTrue(((Map<String, Object>) propertyListBuilder.getRootEntries().get("path")).containsKey("to"));
        assertTrue(((Map<String, Object>) ((Map<String, Object>) propertyListBuilder.getRootEntries().get("path")).get("to")).containsKey("property"));
        assertEquals(property, ((Map<String, Object>) ((Map<String, Object>) propertyListBuilder.getRootEntries().get("path")).get("to")).get("property"));
    }

}