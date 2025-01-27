package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedCreatePropertyList_EmptyPropertiesAddedToEmptyList {

    @Test
    public void createPropertyList_EmptyPropertiesAddedToEmptyList() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        for (int i = 0; i < 3; i++) {
            properties.add(builder.add(null));
        }
        assertEquals(3, properties.size());
    }

}