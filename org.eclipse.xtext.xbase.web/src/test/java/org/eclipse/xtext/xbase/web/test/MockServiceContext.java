/**
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.web.test;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.ISession;
import org.eclipse.xtext.xbase.lib.Pure;

public class MockServiceContext implements IServiceContext {
	private Map<String, String> parameters;

	@Accessors
	private ISession session;

	@Override
	public Set<String> getParameterKeys() {
		return Collections.unmodifiableSet(parameters.keySet());
	}

	@Override
	public String getParameter(String key) {
		return parameters.get(key);
	}

	public MockServiceContext(Map<String, String> parameters, ISession session) {
		this.parameters = parameters;
		this.session = session;
	}

	@Pure
	public ISession getSession() {
		return session;
	}
}
