package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOutputSettings_SimpleSettings {

    @Test
    public void outputSettings_SimpleSettings() {
        OutputSettings settings = new OutputSettings();
        Document document = new Document();
        document.outputSettings(settings);
    }

}