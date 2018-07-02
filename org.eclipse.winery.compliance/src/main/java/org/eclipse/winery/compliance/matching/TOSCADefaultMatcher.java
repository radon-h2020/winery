/********************************************************************************
 * Copyright (c) 2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 ********************************************************************************/
package org.eclipse.winery.compliance.matching;

import org.eclipse.winery.compliance.model.TOSCAEdge;
import org.eclipse.winery.compliance.model.TOSCANode;

import org.apache.commons.lang3.StringUtils;

public class TOSCADefaultMatcher implements ITOSCAMatcher {

	@Override
	public boolean isCompatible(TOSCANode left, TOSCANode right) {
		return StringUtils.equals(left.getNodeTemplate().getName(), right.getNodeTemplate().getName());
	}

	@Override
	public boolean isCompatible(TOSCAEdge left, TOSCAEdge right) {
		return StringUtils.equals(left.getTemplate().getName(), right.getTemplate().getName());
	}
}
