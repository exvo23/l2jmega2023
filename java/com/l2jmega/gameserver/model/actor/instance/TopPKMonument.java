/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jmega.gameserver.model.actor.instance;

import com.l2jmega.Config;
import com.l2jmega.gameserver.instancemanager.CharacterKillingManager;
import com.l2jmega.gameserver.model.actor.L2PcPolymorph;
import com.l2jmega.gameserver.model.actor.template.NpcTemplate;

/**
 * @author paytaly
 */
public class TopPKMonument extends L2PcPolymorph
{
	public TopPKMonument(int objectId, NpcTemplate template)
	{
		super(objectId, template);
	}
	
	@Override
	public void onSpawn()
	{
		super.onSpawn();
		if (Config.CKM_ENABLED)
			CharacterKillingManager.getInstance().addPKMorphListener(this);
	}
	
	@Override
	public void deleteMe()
	{
		super.deleteMe();
		if (Config.CKM_ENABLED)
			CharacterKillingManager.getInstance().removePKMorphListener(this);
	}
}
