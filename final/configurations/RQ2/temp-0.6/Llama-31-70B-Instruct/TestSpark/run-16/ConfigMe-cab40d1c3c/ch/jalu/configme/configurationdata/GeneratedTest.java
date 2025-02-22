package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testAdd() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.containsKey("DataSource"));
        assertTrue(rootEntries.get("DataSource") instanceof Map);
        Map<?, ?> dataSourceMap = (Map<?, ?>) rootEntries.get("DataSource");
        assertEquals(1, dataSourceMap.size());
        assertTrue(dataSourceMap.containsKey("mysql"));
        assertEquals(property, dataSourceMap.get("mysql"));
    }

    @Test
    public void testAdd_WithDuplicatePath() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}