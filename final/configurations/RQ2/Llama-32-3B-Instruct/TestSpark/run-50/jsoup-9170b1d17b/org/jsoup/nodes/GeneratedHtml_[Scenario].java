package org.jsoup.nodes;

public class GeneratedHtml_[Scenario]{

@Test
public void html_[
Scenario]()throws

IOException {
    Attributes attributes = new Attributes();
    Document.OutputSettings outputSettings = new Document.OutputSettings();
    Appendable accum = MockUtil.createMockAppendable();
    final StringBuilder sb = new StringBuilder();
    attributes.html(accum, outputSettings);
    assertEquals(sb.toString(), accum.toString());
}

}