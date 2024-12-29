package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.NodeFilter;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Consumer;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.NonnullByDefault;
import org.jsoup.internal.StringUtil;
import org.jsoup.internal.Normalizer;
import org.jsoup.select.Collector;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class GeneratedTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Tag.valueOf("div")},
                {Tag.valueOf("span")},
                {Tag.valueOf("p")},
                {Tag.valueOf("h1")},
                {Tag.valueOf("h2")},
                {Tag.valueOf("h3")},
                {Tag.valueOf("h4")},
                {Tag.valueOf("h5")},
                {Tag.valueOf("h6")},
                {Tag.valueOf("a")},
                {Tag.valueOf("img")},
                {Tag.valueOf("video")},
                {Tag.valueOf("audio")},
                {Tag.valueOf("canvas")},
                {Tag.valueOf("embed")},
                {Tag.valueOf("iframe")},
                {Tag.valueOf("object")},
                {Tag.valueOf("picture")},
                {Tag.valueOf("source")},
                {Tag.valueOf("track")},
                {Tag.valueOf("video")},
                {Tag.valueOf("audio")},
                {Tag.valueOf("canvas")},
                {Tag.valueOf("embed")},
                {Tag.valueOf("iframe")},
                {Tag.valueOf("object")},
                {Tag.valueOf("picture")},
                {Tag.valueOf("source")},
                {Tag.valueOf("track")},
        });
    }

    @Parameter(0)
    public Tag tag;

}