package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBuildDirectivesNoAnnotations {

    @Test
    public void buildDirectivesNoAnnotations() {
        DirectivesBuilder builder = new DirectivesBuilder(new Object(), null);
        GraphQLDirective[] result = builder.build();
        assertEquals(0, result.length);
    }

}