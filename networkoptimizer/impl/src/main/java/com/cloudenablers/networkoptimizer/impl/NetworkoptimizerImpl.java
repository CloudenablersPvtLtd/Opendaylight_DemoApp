/*
 * Copyright © 2015 Copyright (c) 2016 Cloudenablers and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package com.cloudenablers.networkoptimizer.impl;

import java.util.concurrent.Future;

import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.networkoptimizer.rev150105.NetworkoptimizerService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.networkoptimizer.rev150105.ServiceAccountInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.networkoptimizer.rev150105.ServiceAccountOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.networkoptimizer.rev150105.ServiceAccountOutputBuilder;

import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;

public class NetworkoptimizerImpl implements NetworkoptimizerService {

	@Override
	public Future<RpcResult<ServiceAccountOutput>> serviceAccount(ServiceAccountInput input) {
		ServiceAccountOutputBuilder serviceAccBuilder = new ServiceAccountOutputBuilder();
		serviceAccBuilder.setServiceName("RPC request successful for Service: " + input.getName());
		return RpcResultBuilder.success(serviceAccBuilder.build()).buildFuture();
	}
}
	
