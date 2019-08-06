/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.jaxws.test.wsr.server.stub;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 *
 */
@WebServiceClient(name = "PeopleService", targetNamespace = "http://server.wsr.test.jaxws.ws.ibm.com", wsdlLocation = "META-INF/PeopleService.wsdl")
public class PeopleService extends Service {

    private final static URL PEOPLESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.ibm.ws.jaxws.test.wsr.server.stub.PeopleService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = PeopleService.class.getResource("PeopleService.wsdl");

            url = new URL(baseUrl, "PeopleService.wsdl");
        } catch (MalformedURLException e) {

        }
        PEOPLESERVICE_WSDL_LOCATION = url;
    }

    public PeopleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PeopleService() {
        super(PEOPLESERVICE_WSDL_LOCATION, new QName("http://server.wsr.test.jaxws.ws.ibm.com", "PeopleService"));
    }

    /**
     *
     * @return
     *         returns People
     */
    @WebEndpoint(name = "BillPort")
    public People getBillPort() {
        return super.getPort(new QName("http://server.wsr.test.jaxws.ws.ibm.com", "BillPort"), People.class);
    }

    /**
     *
     * @param features
     *                     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in the <code>features</code> parameter will have their
     *                     default
     *                     values.
     * @return
     *         returns People
     */
    @WebEndpoint(name = "BillPort")
    public People getBillPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.wsr.test.jaxws.ws.ibm.com", "BillPort"), People.class, features);
    }

}