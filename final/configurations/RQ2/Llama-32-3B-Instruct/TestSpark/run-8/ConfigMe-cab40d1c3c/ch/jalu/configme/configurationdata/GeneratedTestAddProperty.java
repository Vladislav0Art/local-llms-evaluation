package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestAddProperty {

    @Test
    public void testAddProperty() {
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder(propertyList);
        builder.addProperty("property1", "value1");
        assertEquals(1, propertyList.size());
    }

}