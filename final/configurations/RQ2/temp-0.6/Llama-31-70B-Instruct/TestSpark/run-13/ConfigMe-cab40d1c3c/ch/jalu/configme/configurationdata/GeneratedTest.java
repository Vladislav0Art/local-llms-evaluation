package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Property<Object> property;

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addPropertyTest() {
        when(property.getPath()).thenReturn("path.subpath");
        propertyListBuilder.add(property);
        assertNotNull(propertyListBuilder.getRootEntries());
        assertNotNull(propertyListBuilder.getRootEntries().get("path"));
        assertEquals(property, propertyListBuilder.getRootEntries().get("path").get("subpath"));
    }

    @Test
    public void addPropertyWithDuplicatePathTest() {
        when(property.getPath()).thenReturn("path.subpath");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void addPropertyWithConflictingPathTest() {
        when(property.getPath()).thenReturn("path.subpath");
        propertyListBuilder.add(property);
        when(property.getPath()).thenReturn("path.subpath.subsubpath");
        propertyListBuilder.add(property);
    }

}