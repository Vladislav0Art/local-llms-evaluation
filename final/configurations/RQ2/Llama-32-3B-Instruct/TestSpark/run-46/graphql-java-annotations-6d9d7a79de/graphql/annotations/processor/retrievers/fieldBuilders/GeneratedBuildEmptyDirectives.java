package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedBuildEmptyDirectives {

    @Test
    public void BuildEmptyDirectives() {
        AnnotatedElement object = createMockAnnotatedElement();
        ProcessingElementsContainer container = createMockProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        assertTrue(result.length == 0);
    }

}