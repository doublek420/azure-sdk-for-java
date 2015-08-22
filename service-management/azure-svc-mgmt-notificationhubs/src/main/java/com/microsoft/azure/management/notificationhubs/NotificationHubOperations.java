/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.notificationhubs;

import com.microsoft.azure.management.notificationhubs.models.AuthorizationRulesCreateOrUpdateParameters;
import com.microsoft.azure.management.notificationhubs.models.AuthorizationRulesCreateOrUpdateResponse;
import com.microsoft.azure.management.notificationhubs.models.AuthorizationRulesGetResponse;
import com.microsoft.azure.management.notificationhubs.models.AuthorizationRulesListResponse;
import com.microsoft.azure.management.notificationhubs.models.CheckAvailabilityParameters;
import com.microsoft.azure.management.notificationhubs.models.CheckAvailabilityResponse;
import com.microsoft.azure.management.notificationhubs.models.NotificationHubCreateOrUpdateParameters;
import com.microsoft.azure.management.notificationhubs.models.NotificationHubCreateOrUpdateResponse;
import com.microsoft.azure.management.notificationhubs.models.NotificationHubGetResponse;
import com.microsoft.azure.management.notificationhubs.models.NotificationHubListResponse;
import com.microsoft.azure.management.notificationhubs.models.ResourceListKeys;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* The Management API includes operations for managing notification hubs.
*/
public interface NotificationHubOperations {
    /**
    * Checks the availability of the given notificationHub in a namespace.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/jj870968.aspx
    * for more information)
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param parameters Required. The notificationHub name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response of the Check NameAvailability operation.
    */
    CheckAvailabilityResponse checkAvailability(String resourceGroupName, String namespaceName, CheckAvailabilityParameters parameters) throws IOException, ServiceException;
    
    /**
    * Checks the availability of the given notificationHub in a namespace.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/jj870968.aspx
    * for more information)
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param parameters Required. The notificationHub name.
    * @return Response of the Check NameAvailability operation.
    */
    Future<CheckAvailabilityResponse> checkAvailabilityAsync(String resourceGroupName, String namespaceName, CheckAvailabilityParameters parameters);
    
    /**
    * The create NotificationHub authorization rule operation creates an
    * authorization rule for a NotificationHub
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @param authorizationRuleName Required. The namespace
    * authorizationRuleName name.
    * @param parameters Required. The shared access authorization rule.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response of the CreateOrUpdate operation on the AuthorizationRules
    */
    AuthorizationRulesCreateOrUpdateResponse createAuthorizationRule(String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName, AuthorizationRulesCreateOrUpdateParameters parameters) throws IOException, ServiceException;
    
    /**
    * The create NotificationHub authorization rule operation creates an
    * authorization rule for a NotificationHub
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @param authorizationRuleName Required. The namespace
    * authorizationRuleName name.
    * @param parameters Required. The shared access authorization rule.
    * @return Response of the CreateOrUpdate operation on the AuthorizationRules
    */
    Future<AuthorizationRulesCreateOrUpdateResponse> createAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName, AuthorizationRulesCreateOrUpdateParameters parameters);
    
    /**
    * Creates a new NotificationHub in a namespace.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj856303.aspx for
    * more information)
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @param parameters Required. Parameters supplied to the create a Namespace
    * Resource.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response of the CreateOrUpdate operation on the NotificationHub
    */
    NotificationHubCreateOrUpdateResponse createOrUpdate(String resourceGroupName, String namespaceName, String notificationHubName, NotificationHubCreateOrUpdateParameters parameters) throws IOException, ServiceException;
    
    /**
    * Creates a new NotificationHub in a namespace.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj856303.aspx for
    * more information)
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @param parameters Required. Parameters supplied to the create a Namespace
    * Resource.
    * @return Response of the CreateOrUpdate operation on the NotificationHub
    */
    Future<NotificationHubCreateOrUpdateResponse> createOrUpdateAsync(String resourceGroupName, String namespaceName, String notificationHubName, NotificationHubCreateOrUpdateParameters parameters);
    
    /**
    * Deletes a notification hub associated with a namespace.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String resourceGroupName, String namespaceName, String notificationHubName) throws InterruptedException, ExecutionException, IOException, ServiceException;
    
    /**
    * Deletes a notification hub associated with a namespace.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String resourceGroupName, String namespaceName, String notificationHubName);
    
    /**
    * The delete a notificationHub authorization rule operation
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @param authorizationRuleName Required. The namespace
    * authorizationRuleName name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse deleteAuthorizationRule(String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName) throws IOException, ServiceException;
    
    /**
    * The delete a notificationHub authorization rule operation
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @param authorizationRuleName Required. The namespace
    * authorizationRuleName name.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName);
    
    /**
    * Lists the notification hubs associated with a namespace.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response of the Get NotificationHub operation.
    */
    NotificationHubGetResponse get(String resourceGroupName, String namespaceName, String notificationHubName) throws IOException, ServiceException;
    
    /**
    * Lists the notification hubs associated with a namespace.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @return The response of the Get NotificationHub operation.
    */
    Future<NotificationHubGetResponse> getAsync(String resourceGroupName, String namespaceName, String notificationHubName);
    
    /**
    * The get authorization rule operation gets an authorization rule for a
    * NotificationHub by name.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace to get the authorization
    * rule for.
    * @param notificationHubName Required. The notification hub name.
    * @param authorizationRuleName Required. The entity name to get the
    * authorization rule for.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response of the Get Namespace operation.
    */
    AuthorizationRulesGetResponse getAuthorizationRule(String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName) throws IOException, ServiceException;
    
    /**
    * The get authorization rule operation gets an authorization rule for a
    * NotificationHub by name.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace to get the authorization
    * rule for.
    * @param notificationHubName Required. The notification hub name.
    * @param authorizationRuleName Required. The entity name to get the
    * authorization rule for.
    * @return The response of the Get Namespace operation.
    */
    Future<AuthorizationRulesGetResponse> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName);
    
    /**
    * Lists the PNS Credentials associated with a notification hub .
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response of the Get NotificationHub operation.
    */
    NotificationHubGetResponse getPnsCredentials(String resourceGroupName, String namespaceName, String notificationHubName) throws IOException, ServiceException;
    
    /**
    * Lists the PNS Credentials associated with a notification hub .
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @return The response of the Get NotificationHub operation.
    */
    Future<NotificationHubGetResponse> getPnsCredentialsAsync(String resourceGroupName, String namespaceName, String notificationHubName);
    
    /**
    * Lists the notification hubs associated with a namespace.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response of the List NotificationHub operation.
    */
    NotificationHubListResponse list(String resourceGroupName, String namespaceName) throws IOException, ServiceException;
    
    /**
    * Lists the notification hubs associated with a namespace.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @return The response of the List NotificationHub operation.
    */
    Future<NotificationHubListResponse> listAsync(String resourceGroupName, String namespaceName);
    
    /**
    * The get authorization rules operation gets the authorization rules for a
    * NotificationHub.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The NotificationHub to get the
    * authorization rule for.
    * @param notificationHubName Required. The notification hub name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response of the List Namespace operation.
    */
    AuthorizationRulesListResponse listAuthorizationRules(String resourceGroupName, String namespaceName, String notificationHubName) throws IOException, ServiceException;
    
    /**
    * The get authorization rules operation gets the authorization rules for a
    * NotificationHub.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The NotificationHub to get the
    * authorization rule for.
    * @param notificationHubName Required. The notification hub name.
    * @return The response of the List Namespace operation.
    */
    Future<AuthorizationRulesListResponse> listAuthorizationRulesAsync(String resourceGroupName, String namespaceName, String notificationHubName);
    
    /**
    * Gets the Primary and Secondary ConnectionStrings to the NotificationHub
    * (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @param authorizationRuleName Required. The connection string of the
    * NotificationHub for the specified authorizationRule.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Namespace/NotificationHub Connection String
    */
    ResourceListKeys listKeys(String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName) throws IOException, ServiceException;
    
    /**
    * Gets the Primary and Secondary ConnectionStrings to the NotificationHub
    * (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param namespaceName Required. The namespace name.
    * @param notificationHubName Required. The notification hub name.
    * @param authorizationRuleName Required. The connection string of the
    * NotificationHub for the specified authorizationRule.
    * @return Namespace/NotificationHub Connection String
    */
    Future<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName);
}