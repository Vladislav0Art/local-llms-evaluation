package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateRootEntriesMapShouldBeEmpty {

    @Test
    public void createRootEntriesMapShouldBeEmpty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertThat(rootEntries.size(), is(0));
    }
}

class MockProperty implements Property {

    private String name;

    public MockProperty(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}