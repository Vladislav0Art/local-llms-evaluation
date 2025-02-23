package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");
        builder.add(property);
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertEquals(property, rootEntries.get("DataSource.mysql"));
    }

}