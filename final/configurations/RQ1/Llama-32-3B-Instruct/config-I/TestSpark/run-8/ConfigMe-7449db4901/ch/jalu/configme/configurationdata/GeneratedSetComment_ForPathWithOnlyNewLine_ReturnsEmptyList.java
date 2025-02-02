package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_ForPathWithOnlyNewLine_ReturnsEmptyList {

    @Test
    public void setComment_ForPathWithOnlyNewLine_ReturnsEmptyList() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String commentLines[] = {"\n"};
        Map<String, List<String>> result = comments.setComment("path", commentLines);
        assertThat(result.get("path").size(), is(0));
    }

}