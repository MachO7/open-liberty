/*******************************************************************************
 * Copyright (c) 2017, 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.transactional.web;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

@Transactional(value = TxType.MANDATORY,
               rollbackOn = { IllegalAccessException.class, InterruptedException.class },
               dontRollbackOn = { ArithmeticException.class, NullPointerException.class })
public class ClassAnnotatedMandatoryTestBean extends POJO {
}