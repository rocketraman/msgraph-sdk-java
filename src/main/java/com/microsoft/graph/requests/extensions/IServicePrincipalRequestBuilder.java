// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalRequest;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IServicePrincipalAddKeyRequestBuilder;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IServicePrincipalAddPasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRemoveKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRemovePasswordRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal Request Builder.
 */
public interface IServicePrincipalRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IServicePrincipalRequest instance
     */
    IServicePrincipalRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IServicePrincipalRequest instance
     */
    IServicePrincipalRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IAppRoleAssignmentCollectionRequestBuilder appRoleAssignedTo();

    IAppRoleAssignmentRequestBuilder appRoleAssignedTo(final String id);

    IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments();

    IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id);

    IClaimsMappingPolicyCollectionWithReferencesRequestBuilder claimsMappingPolicies();

    IClaimsMappingPolicyWithReferenceRequestBuilder claimsMappingPolicies(final String id);

    IEndpointCollectionRequestBuilder endpoints();

    IEndpointRequestBuilder endpoints(final String id);

    IHomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder homeRealmDiscoveryPolicies();

    IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder homeRealmDiscoveryPolicies(final String id);

    IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder oauth2PermissionGrants();

    IOAuth2PermissionGrantWithReferenceRequestBuilder oauth2PermissionGrants(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf();

    IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder createdObjects();

    IDirectoryObjectWithReferenceRequestBuilder createdObjects(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder owners();

    IDirectoryObjectWithReferenceRequestBuilder owners(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects();

    IDirectoryObjectWithReferenceRequestBuilder ownedObjects(final String id);

    ITokenIssuancePolicyCollectionWithReferencesRequestBuilder tokenIssuancePolicies();

    ITokenIssuancePolicyWithReferenceRequestBuilder tokenIssuancePolicies(final String id);

    ITokenLifetimePolicyCollectionWithReferencesRequestBuilder tokenLifetimePolicies();

    ITokenLifetimePolicyWithReferenceRequestBuilder tokenLifetimePolicies(final String id);
    IServicePrincipalAddKeyRequestBuilder addKey(final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof);
    IServicePrincipalAddPasswordRequestBuilder addPassword(final PasswordCredential passwordCredential);
    IServicePrincipalRemoveKeyRequestBuilder removeKey(final java.util.UUID keyId, final String proof);
    IServicePrincipalRemovePasswordRequestBuilder removePassword(final java.util.UUID keyId);

}
