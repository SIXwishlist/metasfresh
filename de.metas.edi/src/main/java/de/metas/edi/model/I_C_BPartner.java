package de.metas.edi.model;

import java.math.BigDecimal;

/*
 * #%L
 * de.metas.edi
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


public interface I_C_BPartner extends de.metas.invoicecandidate.model.I_C_BPartner
{
	// @formatter:off
	String COLUMNNAME_IsEdiRecipient = "IsEdiRecipient";
	boolean isEdiRecipient();
	void setIsEdiRecipient(boolean IsEdiRecipient);
	// @formatter:on

	// @formatter:off
	String COLUMNNAME_EdiRecipientGLN = "EdiRecipientGLN";
	String getEdiRecipientGLN();
	void setEdiRecipientGLN(String EdiRecipientGLN);
	// @formatter:on

	// @formatter:off
	String COLUMNNAME_EdiDESADVDefaultItemCapacity = "EdiDESADVDefaultItemCapacity";
	BigDecimal getEdiDESADVDefaultItemCapacity();
	void setEdiDESADVDefaultItemCapacity(BigDecimal EdiDESADVDefaultItemCapacity);
	// @formatter:on
}
