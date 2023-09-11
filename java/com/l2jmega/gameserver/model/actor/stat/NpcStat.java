package com.l2jmega.gameserver.model.actor.stat;

import com.l2jmega.gameserver.model.actor.Npc;

public class NpcStat extends CreatureStat
{
	public NpcStat(Npc activeChar)
	{
		super(activeChar);
	}
	
	@Override
	public byte getLevel()
	{
		return getActiveChar().getTemplate().getLevel();
	}
	
	@Override
	public Npc getActiveChar()
	{
		return (Npc) super.getActiveChar();
	}
}