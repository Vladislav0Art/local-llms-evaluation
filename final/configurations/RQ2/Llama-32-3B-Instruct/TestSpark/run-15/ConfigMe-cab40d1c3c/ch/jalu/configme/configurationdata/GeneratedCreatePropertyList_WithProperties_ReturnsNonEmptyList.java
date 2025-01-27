package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreatePropertyList_WithProperties_ReturnsNonEmptyList {

    @Test
    public void createPropertyList_WithProperties_ReturnsNonEmptyList() {
        Property property1 = new Property();
        Property property2 = new Property();
        PropertyListBuilder builder = new PropertyListBuilder();

        List<Property<?>> properties = builder.create();

        assertNotNull(properties);
        assertTrue(properties.size() > 0);
    }

}