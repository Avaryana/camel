/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents an XML &lt;restConfiguration/&gt; element
 */
@XmlRootElement(name = "restConfiguration")
@XmlAccessorType(XmlAccessType.FIELD)
public class RestConfigurationDefinition {

    @XmlAttribute
    private String component;

    @XmlAttribute
    private String host;

    @XmlAttribute
    private String port;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    // Fluent API
    //-------------------------------------------------------------------------

    /**
     * To use a specific Camel rest component
     */
    public RestConfigurationDefinition component(String componentId) {
        setComponent(componentId);
        return this;
    }

    public RestConfigurationDefinition host(String host) {
        setHost(host);
        return this;
    }

    public RestConfigurationDefinition port(int port) {
        setPort("" + port);
        return this;
    }

    public RestConfigurationDefinition port(String port) {
        setPort(port);
        return this;
    }

}
