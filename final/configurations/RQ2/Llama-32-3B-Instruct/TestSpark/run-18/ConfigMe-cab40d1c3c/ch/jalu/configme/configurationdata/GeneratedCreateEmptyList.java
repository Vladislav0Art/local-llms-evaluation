package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateEmptyList {

    @Test
    public void createEmptyList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> list = builder.create();
        assertTrue(list.isEmpty());
    }

}