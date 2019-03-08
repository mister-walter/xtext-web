/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.web.example.entities.serializer

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.nodemodel.INode

class EntitiesSyntacticSequencer extends AbstractEntitiesSyntacticSequencer {
	
	override protected getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node !== null)
			return getTokenText(node);
		return "[]";
	}
}
