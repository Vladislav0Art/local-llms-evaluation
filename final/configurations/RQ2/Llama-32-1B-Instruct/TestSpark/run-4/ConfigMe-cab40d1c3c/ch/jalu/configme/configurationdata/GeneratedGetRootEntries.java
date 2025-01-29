package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedGetRootEntries {

    public List<Property<?>> addProperty(Property<?> property) {
        return Collections.singletonList(property);
    }

    @Test
    public void getRootEntries() {
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals("defaultMap", (String) rootEntries.get("key"));
    }

}