package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGetProperties {

    @Test
    public void testGetProperties() {
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder(propertyList);
        builder.addProperty("property2", "value2");
        builder.addProperty("property3", "value3");
        assertEquals(2, ((PropertyList) builder.getProperties()).size());
    }

}