package com.dlt.transactionscreening.listner;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Azure Storage Queue trigger.
 */
public class DltTransactionQueueListner {
    /**
     * This function will be invoked when a new message is received at the specified path. The message contents are provided as input to this function.
     */
    @FunctionName("DltTransactionQueueListner")
    public void run(
        @QueueTrigger(name = "message", queueName = "dlt-transactions-queue", connection = "tbd") String message,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Queue trigger function processed a message: " + message);
    }
}
