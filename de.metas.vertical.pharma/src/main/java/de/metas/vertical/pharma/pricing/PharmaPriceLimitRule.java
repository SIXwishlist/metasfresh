package de.metas.vertical.pharma.pricing;

import java.util.Set;

import org.adempiere.util.Services;

import de.metas.pricing.limit.IPriceLimitRestrictionsRepository;
import de.metas.pricing.limit.IPriceLimitRule;
import de.metas.pricing.limit.PriceLimitRuleContext;
import de.metas.pricing.limit.PriceLimitRuleResult;

/*
 * #%L
 * metasfresh-pharma
 * %%
 * Copyright (C) 2018 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

public class PharmaPriceLimitRule implements IPriceLimitRule
{

	@Override
	public PriceLimitRuleResult compute(final PriceLimitRuleContext context)
	{
		return new PharmaPriceLimitRuleInstance(context).execute();
	}

	@Override
	public Set<Integer> getPriceCountryIds()
	{
		return Services.get(IPriceLimitRestrictionsRepository.class).getPriceCountryIds();
	}

}
