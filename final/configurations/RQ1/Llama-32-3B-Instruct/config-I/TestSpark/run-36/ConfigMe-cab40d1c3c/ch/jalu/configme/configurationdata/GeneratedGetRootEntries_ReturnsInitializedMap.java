package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedGetRootEntries_ReturnsInitializedMap {

    @Test
    public void getRootEntries_ReturnsInitializedMap() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = builder.getRootEntries();
        assertNotNull(map);
    }
}

class MockProperty implements Property<?> {

    private final String path;

    public MockProperty(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return path;
    }

}