/*
 * Copyright © 2015 Copyright (c) 2016 Cloudenablers and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package com.cloudenablers.networkoptimizer.impl;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import com.cloudenablers.networkoptimizer.impl.NetworkoptimizerImpl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.networkoptimizer.rev150105.NetworkoptimizerService;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetworkoptimizerProvider implements BindingAwareProvider, AutoCloseable {
    private static final Logger LOG = LoggerFactory.getLogger(NetworkoptimizerProvider.class);
    private RpcRegistration<NetworkoptimizerService> optimizerService;
    @Override
    public void onSessionInitiated(ProviderContext session) {
        LOG.info("NetworkoptimizerProvider Session Initiated");
        optimizerService = session.addRpcImplementation(NetworkoptimizerService.class, new NetworkoptimizerImpl());
    }
    @Override
    public void close() throws Exception {
        LOG.info("NetworkoptimizerProvider Closed");
    }
}
