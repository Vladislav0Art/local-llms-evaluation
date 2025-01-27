package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBuildDirectivesWithArgumentType {

    @Test
    public void buildDirectivesWithArgumentType() {
        GraphQLArgument argumentType = Mockito.mock(GraphQLArgument.class);
        GraphQLDirectives directives = new GraphQLDirectives("directives");
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        builder.setAnnotation(directives);
        addArgumentType(directives, argumentType);
        GraphQLDirective[] result = builder.build();
        assertEquals(1, result.length);
    }

}