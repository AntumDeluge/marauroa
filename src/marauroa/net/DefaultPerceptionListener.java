/* $Id: DefaultPerceptionListener.java,v 1.1 2004/07/13 20:31:54 arianne_rpg Exp $ */
/***************************************************************************
 *                      (C) Copyright 2003 - Marauroa                      *
 ***************************************************************************
 ***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/
package marauroa.net;

import marauroa.game.*;

public class DefaultPerceptionListener implements IPerceptionListener
  {
  public DefaultPerceptionListener()
	{
	}
	
  public boolean onAdded(RPObject object)
	{
	return false;
	}
	
  public boolean onModifiedAdded(RPObject object, RPObject changes)
	{
	return false;
	}
	
  public boolean onModifiedDeleted(RPObject object, RPObject changes)
	{
	return false;
	}
	
  public boolean onDeleted(RPObject object)
	{
	return false;
	}
	
  public boolean onMyRPObject(boolean changed,RPObject object)
	{
	return false;
	}
	
  public boolean onClear()
	{
	return false;
	}

  public int onTimeout()
	{
	return 0;
	}
	
  public int onSynced()
	{
	return 0;
	}
	
  public int onUnsynced()
	{
	return 0;
	}
 
  public int onPerceptionBegin(byte type, int timestamp)
	{
	return 0;
	}

  public int onPerceptionEnd(byte type, int timestamp)
	{
	return 0;
	}
	
  public int onException(Exception e, MessageS2CPerception perception) throws Exception
	{
	System.out.println(e.getMessage());
	System.out.println(perception);
	e.printStackTrace();
	
	throw e;
	}
  }
