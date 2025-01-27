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
public class GeneratedGivenDirectivesBuilderWhenBuildThenDirectivesReturnedCorrectly {

    @Mock
    private ProcessingElementsContainer container;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void givenDirectivesBuilderWhenBuildThenDirectivesReturnedCorrectly() throws Exception {
        GraphQLDirective directive1 = newDirective("directive1", Arrays.asList(GraphQLArgument.of("arg")));
        GraphQLDirective directive2 = newDirective("directive2", Arrays.asList(GraphQLArgument.of("arg")));

        List<GraphQLDirective> directives = Arrays.asList(directive1, directive2);
        Mockito.when(container.getDirectives()).thenReturn(directives);

        Method buildMethod = DirectivesBuilder.class.getMethod("build");
        Object result = buildMethod.invoke(directivesBuilder);
        assertNotNull(result);
    }

}