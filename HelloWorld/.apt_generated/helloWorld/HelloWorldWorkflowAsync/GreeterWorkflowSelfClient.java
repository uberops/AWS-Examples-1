/**
 * This code was generated from {@link helloWorld.HelloWorldWorkflowAsync.GreeterWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package helloWorld.HelloWorldWorkflowAsync;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClient;

public interface GreeterWorkflowSelfClient extends WorkflowSelfClient
{
    void greet();
    void greet(StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
}