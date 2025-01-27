package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_MockGetRootEntries_ReturnsValidMap {

    @Test
    public void addProperty_MockGetRootEntries_ReturnsValidMap() {
        Map<String, Object> rootEntriesMock = Mockito.mock(Map.class);
        when(rootEntriesMock.size()).thenReturn(0);
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property<>("test"));
        builder.add(properties.get(0));
        assertEquals(1, builder.create().size());
        verify(rootEntriesMock).size();
    }

}