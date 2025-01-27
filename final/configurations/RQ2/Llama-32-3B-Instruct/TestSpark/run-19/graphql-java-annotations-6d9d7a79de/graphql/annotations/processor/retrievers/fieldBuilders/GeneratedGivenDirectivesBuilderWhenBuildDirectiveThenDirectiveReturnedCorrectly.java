package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static graphql.schema.GraphQLDirective.newDirective;
import static graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import static graphql.annotations.processor.ProcessingElementsContainer.*;
import static graphql.annotations.processor.exceptions.GraphQLAnnotationsException.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenDirectivesBuilderWhenBuildDirectiveThenDirectiveReturnedCorrectly {

    @Mock
    private ProcessingElementsContainer container;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void givenDirectivesBuilderWhenBuildDirectiveThenDirectiveReturnedCorrectly() throws Exception {
        String directiveName = "directive1";
        List<GraphQLArgument> arguments = Arrays.asList(GraphQLArgument.of("arg"));
        GraphQLDirective expectedDirective = newDirective(directiveName, arguments);

        Mockito.when(container.getDirective(directiveName)).thenReturn(expectedDirective);

        Method buildMethod = DirectivesBuilder.class.getMethod("build");
        Object result = buildMethod.invoke(directivesBuilder);
        assertEquals(expectedDirective, result);
    }

}