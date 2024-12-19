package ch.jalu.configme.configurationdata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetRootEntries {

    public static String createPropertyList() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(new Property[]{});
    }

    public static List<Property> createPropertyListWithDifferentTypes() {
        List<Property> properties = Arrays.asList(
                new Property("key1", "type1"),
                new Property("key2", "type2")
        );
        return properties;
    }

    @Test
    public void testGetRootEntries() {
        ObjectMapper mapper = new ObjectMapper();
        String json = createPropertyList();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property> properties = builder.getRootEntries();
        assertTrue(properties.containsAll(Arrays.asList(createPropertyListWithDifferentTypes())));
        assertEquals(2, properties.size());
    }

}