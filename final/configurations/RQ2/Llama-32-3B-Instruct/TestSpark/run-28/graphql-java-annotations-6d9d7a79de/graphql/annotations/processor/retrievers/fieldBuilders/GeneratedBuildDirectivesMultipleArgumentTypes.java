package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBuildDirectivesMultipleArgumentTypes {

    @Test
    public void buildDirectivesMultipleArgumentTypes() {
        GraphQLArgument arg1 = Mockito.mock(GraphQLArgument.class);
        GraphQLArgument arg2 = Mockito.mock(GraphQLArgument.class);
        addArgumentType(new GraphQLDirectives("directives"), arg1);
        addArgumentType(new GraphQLDirectives("directives"), arg2);
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        builder.setAnnotation(new GraphQLDirectives("directives"));
        GraphQLDirective[] result = builder.build();
        assertEquals(2, result.length);
    }

}