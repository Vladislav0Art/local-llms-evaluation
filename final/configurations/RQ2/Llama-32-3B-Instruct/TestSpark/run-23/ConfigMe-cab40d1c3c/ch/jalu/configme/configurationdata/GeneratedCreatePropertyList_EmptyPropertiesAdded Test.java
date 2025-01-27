package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedCreatePropertyList_EmptyPropertiesAdded Test {

    @Test
    public void createPropertyList_EmptyPropertiesAdded

    Test() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        for (int i = 0; i < 3; i++) {
            properties.add(builder.add(null));
        }
        assertEquals(3, properties.size());
    }

}