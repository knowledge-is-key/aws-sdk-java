/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AdminInitiateAuthRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AdminInitiateAuthRequestMarshaller {

    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();
    private static final MarshallingInfo<String> AUTHFLOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthFlow").build();
    private static final MarshallingInfo<Map> AUTHPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthParameters").build();
    private static final MarshallingInfo<Map> CLIENTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientMetadata").build();
    private static final MarshallingInfo<StructuredPojo> ANALYTICSMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnalyticsMetadata").build();
    private static final MarshallingInfo<StructuredPojo> CONTEXTDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContextData").build();

    private static final AdminInitiateAuthRequestMarshaller instance = new AdminInitiateAuthRequestMarshaller();

    public static AdminInitiateAuthRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AdminInitiateAuthRequest adminInitiateAuthRequest, ProtocolMarshaller protocolMarshaller) {

        if (adminInitiateAuthRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(adminInitiateAuthRequest.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(adminInitiateAuthRequest.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(adminInitiateAuthRequest.getAuthFlow(), AUTHFLOW_BINDING);
            protocolMarshaller.marshall(adminInitiateAuthRequest.getAuthParameters(), AUTHPARAMETERS_BINDING);
            protocolMarshaller.marshall(adminInitiateAuthRequest.getClientMetadata(), CLIENTMETADATA_BINDING);
            protocolMarshaller.marshall(adminInitiateAuthRequest.getAnalyticsMetadata(), ANALYTICSMETADATA_BINDING);
            protocolMarshaller.marshall(adminInitiateAuthRequest.getContextData(), CONTEXTDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
