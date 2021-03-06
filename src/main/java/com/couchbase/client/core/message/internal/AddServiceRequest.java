/*
 * Copyright (c) 2016 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.couchbase.client.core.message.internal;

import com.couchbase.client.core.message.AbstractCouchbaseRequest;
import com.couchbase.client.core.service.ServiceType;

import java.net.InetAddress;


public class AddServiceRequest extends AbstractCouchbaseRequest implements InternalRequest {

    private final ServiceType type;
    private final InetAddress hostname;
    private final int port;

    public AddServiceRequest(ServiceType type, String bucket, String password, int port, InetAddress hostname) {
        super(bucket, password);
        this.type = type;
        this.hostname = hostname;
        this.port = port;
    }

    public ServiceType type() {
        return type;
    }

    public InetAddress hostname() {
        return hostname;
    }

    public int port() {
        return port;
    }

    @Override
    public String toString() {
        return "AddServiceRequest{" + "type=" + type + ", hostname='" + hostname + '\'' + ", port=" + port + '}';
    }
}
