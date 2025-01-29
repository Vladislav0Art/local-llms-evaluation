package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedGetRootEntries_ReturnsDefaultMap {

    @BeforeEach
    public void setup() {
        this.propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void getRootEntries_ReturnsDefaultMap() {
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals("defaultMap", (String) rootEntries.get("key"));
    }

}