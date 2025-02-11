package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddRootPropertyTest {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addRootPropertyTest() {
        Map<String, Object> map = new LinkedHashMap<>();
        builder.addRootProperty(map, "root");
        assertEquals(1, map.size());
    }

    private class Property implements Property<?> {
        String path;
        String name;

        public Property(String path) {
            this.path = path;
            this.name = path.split("\\.")[this.path.split("\\.").length - 1];
        }
    }

}