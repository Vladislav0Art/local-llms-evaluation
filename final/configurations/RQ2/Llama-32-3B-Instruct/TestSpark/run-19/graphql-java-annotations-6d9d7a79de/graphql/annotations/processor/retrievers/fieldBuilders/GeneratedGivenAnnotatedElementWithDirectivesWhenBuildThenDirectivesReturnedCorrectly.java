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
public class GeneratedGivenAnnotatedElementWithDirectivesWhenBuildThenDirectivesReturnedCorrectly {

    @Mock
    private ProcessingElementsContainer container;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void givenAnnotatedElementWithDirectivesWhenBuildThenDirectivesReturnedCorrectly() throws Exception {
        AnnotatedElement annotatedElement = getAnnotatedElementWithDirectives();
        ProcessingElementsContainer processingElementsContainer = new ProcessingElementsContainer(annotatedElement);

        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        directivesBuilder.build();

        Method buildMethod = DirectivesBuilder.class.getMethod("build");
        Object result = buildMethod.invoke(directivesBuilder);
        assertNotNull(result);
    }

}