package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GeneratedGetRootEntriesMapIsEmptyWhenNoPropertiesAddedTest {

    @Test
    public void getRootEntriesMapIsEmptyWhenNoPropertiesAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = builder.getRootEntries();
        assertTrue(entries.isEmpty());
    }
}

class MockProperty implements Property<?> {
    private final String id;
    private final String name;

    public MockProperty(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}

}